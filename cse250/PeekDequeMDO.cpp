#include <iostream>
#include <string>
#include <vector>
#include <cmath>
#include <fstream>
using namespace std;

class StringDeque{// Deque time

 protected:
 vector<string>* elements; // its kind of like an array
    int frontItem;   //CLASS INV: indexes item with least index
    int rearSpace;
    int upperBound;  //CLASS INV: indexes space after item with greatest index
       public:
  StringDeque(int guaranteedCapacity):
      elements (new vector<string>(2*guaranteedCapacity)),
      frontItem (guaranteedCapacity),
      rearSpace (guaranteedCapacity),
      upperBound (2*guaranteedCapacity)
      {}




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
    virtual string toString() const {
      string out = "";
      for (int i = frontItem; i < rearSpace; i++) {
         out += elements->at(i) + " ";
      }
      return out;
   }
};

class PeekDeque : public StringDeque{ // new peeking class
    private:

    int peekindex = frontItem;


    public:
    int count = 0;
    int back = 0;
    PeekDeque(int peekCapacity):
    StringDeque(peekCapacity){}

    virtual void moveFrontward(){
        if (peekindex >= rearSpace){
            cerr<< ("Index not within bounds");
        }
        else{
        peekindex++;}
    }
    virtual void moveRearward(){
       if(peekindex<=(frontItem-1)){
        cerr<<("Index out of bounds");
       }

        else{

            peekindex--;}}
    virtual string peek(){
        return elements->at(peekindex);
    }

    virtual void setloop(){
        count = frontItem;
        back = rearSpace;
  }

    virtual void printAllWords(){
    setloop();
     while(count<back){
        cout << elements->at(count)<<" "<<endl;
        count++;
     }
    }
    virtual void printAllStartingWith(char s){
    setloop();
     while(count<back){
        if (elements->at(count)[0]== s){
        cout << elements->at(count)<<" "<<endl;
        }
        count++;
     }
    }

    virtual string popRear() {
      if (isEmpty()) {
         cerr<<("Attempt to pop from empty PeekDeque");
         return "";
      } else {
         return elements->at(--rearSpace);
      }
   }
    virtual string popFront() {
      if (isEmpty()) {
         cerr<<("Attempt to pop from empty PeekDeque");
         return "";
      } else {
         return elements->at(frontItem++);
      }
   }




};


 int main() { //later we'll write more-interesting test code

      PeekDeque* sd = new PeekDeque(100);
      sd->pushFront("oh");
      sd->pushFront("say");
      sd->pushFront("can");
      sd->pushFront("you");
      sd->pushFront("see");
      sd->pushRear("any");
      sd->pushRear("bad bugs");
      sd->pushRear("on");
      sd->pushRear("me?");
      cout<<sd->toString()<<endl;
      string pop2 = sd->popRear() + " " + sd->popRear();
      cout<<pop2 + ", did this print in the right order?"<<endl;
      sd->pushFront("I");
      cout<<"Final Deque: " + sd->toString()<<endl;
      cout<< "Printing all starting with: s"<<endl;
      sd->printAllStartingWith('s');
      cout<< "Printing all:" << endl;
      sd->printAllWords();
   }

