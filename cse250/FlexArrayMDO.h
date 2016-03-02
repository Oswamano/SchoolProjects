// Matthew O'Connor 50000250

#ifndef _FLEXARRAY_H_
#define _FLEXARRAY_H
#endif
#include <string>
#include <vector>
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

//template <typename T>
//class FlexArray::iterator;

template <typename T>
class ChunkNode {
	vector<T>* elements;
	ChunkNode* prev;          //optional, to make doubly-linked list

	ChunkNode<T>* next;       //typename is illegal here
	FlexArray<T>* myList;   //unnecessary?
	size_t mySize;            //INV: # of elements actually stored
	friend class FlexArray<T>;
	friend class FlexArray<T>::iterator;   //begin lab with this line

	public:
	ChunkNode<T>(FlexArray<T>* myList, ChunkNode<T>* myPrev,
			ChunkNode<T>* myNext)
		: elements(new vector<T>())
		  ,prev(myPrev)
		  ,next(myNext) 
		  ,myList(myList)
		  ,mySize(0)
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

	class iterator {    
		//does not need "template <typename T>" since nested
		//CANNOT see (non-static) fields of FlexArray directly.
		//Hence having a "myList" field might be a good idea.

		FlexArray<T>* myList;
		ChunkNode<T>* currNode;
		size_t elemIndex;


		public:
		iterator(FlexArray<T>* list, ChunkNode<T>* node, size_t index)
			: myList(list)
			  , currNode(node)
			  , elemIndex(index)
		{ }
		T& operator*() const {
			if(currNode == NULL || currNode == myList->endNode) {
				throw runtime_error("Current node is NULL, or at end of nodes in FlexArray.");
			}
			return currNode->elements->at(elemIndex);
		}
		iterator& operator++() {
			elemIndex++;
			if(elemIndex == currNode->elements->size()) {
				currNode = currNode->next;
				elemIndex = 0;
			}
			return *this;
		}
		iterator operator++(int ignored) {
			elemIndex++;
			if(elemIndex == currNode->elements->size()) {
				currNode = currNode->next;
				elemIndex = 0;
			}
			return *this;
		}

		bool operator==(const iterator rhs) const {
			return (elemIndex == rhs->elemIndex && currNode == rhs->currNode && myList == rhs->myList);
		}

		bool operator!=(const iterator rhs) const {
			return (elemIndex != rhs->elemIndex || currNode != rhs->currNode || myList == rhs->myList);
		}

		ChunkNode<T>* getCurNode() {
			return currNode;
		}

		size_t getIndex() {
			return elemIndex;
		}

	};

	bool isTheEnd(iterator it) {
		if(it.getCurNode() == NULL)
			return true;
		return false;
	}


	T wordGet(iterator* it, size_t j) {
		ChunkNode<T>* c = it.getCurNode();
		return c->elements->at(j);
	}


	size_t size() {
		size_t sum = 1;
		iterator it = begin();
		ChunkNode<T>* c =it.getCurNode();
		while(c != endNode) {
			c = c->next;
			sum++;
		}
		return sum;
		//return numNodes; //---> if only considering the number of ChunkNodes
	}       //Runs O(n/c) time


	bool empty() {
		if(firstNode == endNode && firstNode->mySize == 0) { return true; }
		return false;
	}       //Runs O(1) time

	iterator begin(){
		return iterator(this, firstNode, 0);
	}

	iterator end(){
		return iterator(this, endNode, 0);
	}

	iterator rbegin(){
		return iterator(this, endNode->prev, endNode->prev->elements->size()-1);
	}


	T at(iterator it) {
		ChunkNode<T>* c = it.getCurNode();
		size_t index = it.getIndex();
		return c->elements->at(index);
	}	

	iterator insert(iterator pos, const T& newItem){
		ChunkNode<T>* current = pos.getCurNode();
		if(empty() && current == endNode){
			current->elements->push_back(newItem);
			current->mySize++;
		} else { 	  
			size_t li = pos.getIndex();
			current->mySize++;
			typename vector<T>::iterator it = current->elements->begin();
			advance(it, li+1);
			current->elements->insert(it,newItem);
			current->mySize = current->mySize++;
			if(current->mySize == nodeCap){
				split(current);
			}
		}
		return iterator(this,current,current->mySize);
	}

	void split(ChunkNode<T>* current){
		ChunkNode<T>* newNode = new ChunkNode<T>(this, current, current->next);
		if(newNode->next != NULL)
			newNode->next->prev = newNode;
		current->next = newNode;     
		size_t half = current->elements->size()/2; 
		for (size_t i = half; i < current->elements->size(); i++) {
			newNode->elements->push_back(current->elements->at(i));
		}
		for (size_t j = current->elements->size() - 1; j >= half; j--) {
			current->elements->erase(current->elements->begin()+j);
		}
	}	
	iterator erase(iterator pos){
		ChunkNode<T>* a = pos.getCurNode();
		a->elements->erase(a->elements->begin() + pos.getIndex());
		a->mySize = a->mySize - 1;
		if(a->mySize < 1) {
			
			a->prev->next = a->next;
			a->next->prev = a->prev;
			numNodes--;
		}
		return iterator(this, a ,pos.getIndex());
	}
};

