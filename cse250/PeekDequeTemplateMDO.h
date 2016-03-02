/** File "PeekDequeTemplateMDO.h" Student Number 50000250. Based off of files by KWR. Assignment 5 first part */
#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>

//#include <cmath>   //for fabs

using std::vector;
using std::endl;
using std::cerr;
using std::ostringstream;
using std::string;
using std::cout;

template <class T> 
class PeekDeque;

template <class T>
class Deque {
   friend class PeekDeque<T>;

   vector<T>* elements;
   int rearSpace;
   int frontItem;
   int upperBound;

   //CLASS INV: frontSpace indicates first empty cell for pushFront
   //           rearItem designates rear item (not space) for popRear---
   //           ---or if there is no such item, rearItem == frontSpace;

 public: 

   explicit Deque<T> (int guaranteedCapacity) 
    : elements(new vector<T>(2*guaranteedCapacity)),
      frontItem(guaranteedCapacity),
      rearSpace(guaranteedCapacity),
      upperBound(2*guaranteedCapacity) 
   { }

   virtual ~Deque<T>() { delete elements; cout << "It's Deque Season!" << endl; }

   virtual bool empty() const { return frontItem == rearSpace; }

   virtual bool full() const { return rearSpace == upperBound; }

   virtual size_t size() const { return rearSpace - frontItem; }

   virtual void pushFront(string newItem) {
      if (full()) {
         cerr << "Are you playing with a full Deque?" << endl;
         cerr << toString() << endl;
      } else {
         elements->at(--frontItem) = newItem;
      }
   }

   virtual void pushRear(string newItem) {
      if (full()) {
         cerr << "Are you playing with a full Deque?" << endl;
         cerr << toString() << endl;
      } else {
         elements->at(rearSpace++) = newItem;
      }
   }

   virtual string popFront() {
      if (empty()) {
         cerr << "Too lazy to throw an EmptyDequeException." << endl;
         return T();
      } else {
         return elements->at(frontItem++);
      }
   }

   virtual string popRear() {
      if (empty()) {
         cerr << "Too lazy to throw an EmptyDequeException." << endl;
         return T();
      } else {
         return elements->at(--rearSpace);  //translates Java "next()"
      }
   }

   virtual string toString() const { 
      ostringstream OUT;
      //string out = "";
      for (int i = frontItem; i < rearSpace; i++) {
         //out += elements->at(i).str() + " ";
         OUT << elements->at(i) << " ";
      }
      //return out;
      return OUT.str();
   }

};


template <class T>
class PeekDeque : public Deque<T> {

   int peekIndex;

 public:

   explicit PeekDeque<T>(int guaranteedCapacity)
    : Deque<T>(guaranteedCapacity), peekIndex(this->frontItem) { }

   virtual ~PeekDeque<T>() { cerr << "No peeking..."; } //automatically calls ~Deque()

   virtual void moveFrontward() { peekIndex--; }

   virtual void moveRearward() { peekIndex++; }

   virtual T peek() const { return this-> elements->at(peekIndex); }

   virtual T popFront() { 
      if (this-> empty()) { 
         cerr << "Pop attempt from empty PeekDeque" << endl; 
         return T();   //CHANGE: Must return something on any branch
      } else {
         return Deque<T>::popFront();
      }
   }

   virtual string popRear() {
      if (this->empty()) {
         cerr << "Pop attempt from empty PeekDeque" << endl;
         return T();  //CHANGE: Must return something on any branch
      } else {
         return Deque<T>::popRear();
      }
   }

   //Extra functionality

   virtual void setPeekToFront() { peekIndex =this-> frontItem; }

   virtual bool atRear() const { return peekIndex ==this-> rearSpace; }

};
