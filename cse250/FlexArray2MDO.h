/** File "FlexArray2MDO.h", by MDO.  Student Number 50000250
 
*/
#ifndef _FLEXARRAY_H_
#define _FLEXARRAY_H
#endif

#include <string>
#include <vector>
#include <ios>
#include <iostream>
#include <fstream>
#include <sstream>
#include <exception>
#include <stdexcept>

using std::vector;
using std::endl;
using std::cerr;
using std::ostringstream;
using std::runtime_error;


template <typename T>    //REQ: T has T() and T.str()
class FlexArray;


template <typename T>
class ChunkNode {
	vector<T>* elements;
	ChunkNode* prev;          //optional, to make doubly-linked list

	ChunkNode<T>* next;       //typename is illegal here
	FlexArray<T>* myList;     //unnecessary? 
	size_t mySize;            //INV: # of elements actually stored
	friend class FlexArray<T>;
	friend class FlexArray<T>::iterator;   //begin lab with this line

   public:
	ChunkNode<T>(FlexArray<T>* myList, ChunkNode<T>* myPrev,
					   ChunkNode<T>* myNext)
	 : elements(new vector<T>())
	 , prev(myPrev)
	 , next(myNext)
	 , myList(myList)
	 , mySize(0)
	{ }
};

template <class T>
class FlexArray {
	ChunkNode<T>* firstNode;
	ChunkNode<T>* endNode;
	size_t nodeCap;
	size_t numNodes;
	//friend class ChunkNode<T>;   //IMHO not necessary

	//CLASS INV: endNode is a dummy node, used as target for iterations.
	//firstNode is a real node only when the FlexArray is nonempty (Optional change)
	//Empty is size() == 0, rather than endNode == firstNode.
	//Note: for empty FlexArray, rbegin() cannot assume endNode->prev is
	//non-NULL.  For empty FlexArray, both begin() and rbegin() should == end()
	//MOST IMPT: every non-dummy node is nonempty---empty elements means de-allocate node.

   public:

	explicit FlexArray<T>(size_t nodeCap) 
	 : firstNode(new ChunkNode<T>(this,NULL,NULL))
	 , endNode(firstNode)
	 , nodeCap(nodeCap)
	 , numNodes(1)
	{ }

	FlexArray<T>()
	 : firstNode(new ChunkNode<T>(this,NULL,NULL))
	 , endNode(firstNode)
	 , nodeCap(40)
	 , numNodes(1)
	{ }

	class iterator {     	//does not need "template <typename T>" since nested
				//CANNOT see (non-static) fields of FlexArray directly.
				//Hence having a "myList" field might be a good idea.
		friend class FlexArray<T>;

		FlexArray<T>* myList;
		ChunkNode<T>* currNode;
		size_t IndexElements;

		iterator(FlexArray<T>* list, ChunkNode<T>* node, size_t index)
		 : myList(list)
	 	 , currNode(node)
		 , IndexElements(index)
		{ }

		T& operator*() const {
			if(currNode == NULL || currNode == myList->endNode) {
				throw runtime_error("Current node is NULL, or at end of nodes in FlexArray.");
			}
			return currNode->elements->at(IndexElements);
		}

		iterator& operator++() {
			IndexElements++;
			if(IndexElements == currNode->elements->size()) {
				if(currNode->next == myList->endNode) {
					cerr << "Reached end of FlexArray nodes." << endl;
					return *this;
				}
				currNode = currNode->next;
				IndexElements = 0;
			}
			return *this;
		}

		iterator operator++(int ignored) {
			iterator copy = *this;
			this++;
			//operator++();
			return copy;
		}

		bool operator==(const iterator rhs) const {
			return (IndexElements == rhs.IndexElements && currNode == rhs.currNode && myList == rhs.myList);
		}

		bool operator!=(const iterator rhs) const {
			return (IndexElements != rhs.IndexElements || currNode != rhs.currNode || myList == rhs.myList);
		}

		//Helper method, short-hand way of getting the current node's number of elements
		size_t nodeSize() {
			return currNode->mySize;
		}

		//Helper method, short-hand way of getting the current node's vector capacity
		size_t nodeCap() {
			return currNode->elements->size();
		}
	};

	//at, insert, erase, operator[] etc. methods go here...
	
	/**
	A method to easily get the number of total inserted elements in the FlexArray
	*/
	size_t items() {
		size_t sum = 0;
		iterator it = begin();
		while(it != end()) {
			sum = sum + it.currNode->mySize;
			it.currNode = it.currNode->next;
		}
		return sum;
	}
	
	size_t size() {
		size_t sum = 0;
		iterator it = begin();
		while(it != end()) {
			sum = sum + it.currNode->elements->size();
			it.currNode = it.currNode->next;
		}
		return sum;
		//return numNodes; //---> if only considering the number of ChunkNodes
	}	//Runs O(n/c) time

	bool empty() {
		if(endNode == firstNode) { return true; }
		//if(numNodes == 0) { return true; } //---> alternate way
		return false;
	}	//Runs O(1) time
	
	//T& at(size_t i) {
	T *at(size_t i) {
		size_t remaining = i;
		iterator it = begin();
		while(it != end()) {
			if(remaining < it.nodeCap()) {
				return &(it.currNode->elements->at(remaining));
			} else {
				remaining = remaining - it.nodeSize();
				it.currNode = it.currNode->next;
			}
		}
		return NULL;
	}	//Runs O(n/c) time

	T& operator[](size_t i) {
		at(i);
	}	//Runs O(n/c) time

	void split(ChunkNode<T>* current) {
		//create and link up the new node
		ChunkNode<T>* newNode = new ChunkNode<T>(this, current, current->next);
		newNode->next->prev = newNode;
		current->next = newNode;
		numNodes++;

		size_t half = nodeCap / 2;

		//copy latter half into new node
		for(size_t i = half; i < current->elements->size(); i++) {
			newNode->elements->push_back(current->elements->at(i));
		}

		//erase latter half in current node
		typename vector<T>::iterator half_itr = current->elements->begin() + half;
		typename vector<T>::iterator end_itr  = current->elements->end();
		current->elements->erase(half_itr, end_itr);
	}

	iterator insert(iterator pos, const T& newItem) {
		//if there are no nodes in the FlexArray
		if(empty() && pos == end()) {
			firstNode = new ChunkNode<T>(this, NULL, endNode);
			firstNode->next->prev = firstNode;
			numNodes++;
			pos = begin();	//Not resetting the iterator position was causing seg faults
			pos.currNode->elements->push_back(newItem);
		}

		//insert into existing node
		ChunkNode<T>* temp = pos.currNode;
		size_t ei = pos.IndexElements;
		typename vector<T>::iterator itr = temp->elements->begin() + ei;
		temp->elements->insert(itr, newItem);
		pos.currNode->mySize = pos.currNode->mySize + 1;

		//is the node full?
		if(pos.currNode->mySize == nodeCap) {
			split(pos.currNode);
		}
		return iterator(this, temp, temp->mySize);	//may have to change
	}

	iterator erase(iterator pos) {
		pos.currNode->elements->erase(pos.currNode->elements->begin() + pos.IndexElements);
		pos.currNode->mySize = pos.currNode->mySize - 1;
		
		//delete the current node if it is empty
		if(pos.currNode->mySize < 1) {
			pos.currNode->prev->next = pos.currNode->next;
			pos.currNode->next->prev = pos.currNode->prev;
			numNodes--;
		}
		return iterator(this, pos.currNode, pos.IndexElements);
	}

	iterator begin() {
		return iterator(this, firstNode, 0);
	}

	iterator end() {
		return iterator(this, endNode, 0);
	}

	iterator rbegin() {
		return iterator(this, endNode->prev, endNode->prev->elements->size() - 1);
	}

	std::string toString() {
		return "";
	}
};
