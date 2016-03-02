// Matthew O'Connor Student number 50000250 homework 2 DequeTestas
#include <iostream>
#include <string>
#include <vector>
#include <cmath>
#include <fstream>
using namespace std;

class StringDeque{// Deque time

 private:
 vector<string>* elements; // its kind of like an array
    int frontItem;   //CLASS INV: indexes item with least index
   int rearSpace;
    int upperBound;  //CLASS INV: indexes space after item with greatest index
       public:
  StringDeque(int guaranteedCapacity){
      elements = (new vector<string>(2*guaranteedCapacity)),
      frontItem = guaranteedCapacity;
      rearSpace = guaranteedCapacity;
      upperBound = 2*guaranteedCapacity;
  }

   virtual bool isEmpty() const { return frontItem == rearSpace; }
   virtual bool isFull() const { return rearSpace == upperBound || frontItem == 0; }
   virtual int size() const { return rearSpace - frontItem; }

  virtual string popRear() {
      if (isEmpty()) {
         cerr<<("Later we'll define and throw an EmptyQException");
         return "";
      } else {
         return elements->at(--rearSpace);
      }
   }
virtual string popFront() {
      if (isEmpty()) {
         cerr<<("Later we'll define and throw an EmptyQException");
         return "";
      } else {
         return elements->at(frontItem++);
      }
   }

    virtual void pushFront(string newItem) {
      elements->at(--frontItem) = newItem;
   }
   virtual void pushRear(string newItem) {
      elements->at(rearSpace++) = newItem;
   }
virtual string toString() {
      string out = "";
      for (int i = frontItem; i < rearSpace; i++) {
         out += out + elements->at(i) + " ";
      }
      return out;
   }
 int main() { //later we'll write more-interesting test code

      StringDeque* sd = new StringDeque(100);
      sd->pushFront("oh");
      sd->pushFront("say");
      sd->pushFront("can");
      sd->pushFront("you");
      sd->pushFront("see");
      sd->pushRear("any");
      sd->pushRear("bad bugs");
      sd->pushRear("on");
      sd->pushRear("me?");
      cout<<(sd->toString());
      string pop2 = sd->popRear() + " " + sd->popRear();
      cout<<(pop2 + ", did this print in the right order?");
      sd->pushFront("I");
      cout<<("Final Deque: " + sd->toString());
   }
};

