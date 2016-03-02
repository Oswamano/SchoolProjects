// Matthew O'Connor Homework 4 50000250
#include <iostream>
#include <string>
#include <vector>
#include <cmath>
#include <fstream>
using namespace std;
int findSmallerString( const string& x,  const string& y){// finds the smaller string and it's size
    if(x.size()< y.size()){return x.size();}
    else{return y.size();}
}

 int tellSmallerString( const string& x,  const string& y){// tells which string is smaller
    if(x.size()< y.size()){return 1;}
    else{return 2;}
}

 int firstChange( const string& x,const string& y){// finds the first position that a string changes at
    int a = findSmallerString(x,y);
    for(int i = 0;i<a;i++){
        if (x.at(i)!=y.at(i)){
            return i;
        }
}
 return -1;}

bool ed1(const string&x, const string& y){
    int numOfChanges=0;
    int ySize=y.size();
    int xSize= x.size();
    int difference = abs(ySize-xSize);// gets difference between the strings
    if (difference>1){// if difference is larger than two edit distance is larger than one
        return false;
    }
    if( difference==0){
        for (int i = 0; i<ySize; i++){// if there is no difference in size looks for any changes
            if(y.at(i)!=x.at(i)){// if a change is found increments change count
                numOfChanges++;
            }
        }
    if (numOfChanges==1){return true;}// only allows 1 change otherwise it is false
    else{return false;}
    }
        if(difference==1){
            int temp = firstChange(x,y);
            if (temp==-1){

                    return true;}
            else {
                int tell = tellSmallerString(x,y);
                string xtemp = x;
                string ytemp =y;
                if (tell==1){xtemp.erase(temp,1);}// this line and the next takes out the first difference
                else if (tell==2){ytemp.erase(temp,1);}// the difference is taken out so it can check for more
                for (int i = 0; i<xtemp.size(); i++){
                if(ytemp.at(i)!=xtemp.at(i))
                numOfChanges++;}
                if (numOfChanges>0){return false;}
                else{return true;}
            }
        }
        return false;
    }



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
    virtual string peekAhead(){
        return elements->at(peekindex+1);
    }
    virtual string peekBack(){
        return elements->at(peekindex-1);
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
    virtual void setPeekFront(){peekindex=frontItem;}
    virtual void setPeekBack(){peekindex=rearSpace;}


};

int main(){
//cout<< "entered"<<endl;
int count=0;
string first;
string second;
ifstream in("wordz.txt",ios::in);
string read;
PeekDeque* peeker = new PeekDeque(100);
while(getline(in,read)){
peeker->pushRear(read);
//cout<<"adding"<<endl;
}
bool check = true;
if(!peeker->isEmpty()){

   while(count<(peeker->size())-1){
   first  = peeker->peek();
  // cout<<"first:"<<first<<endl;
   second = peeker->peekAhead();
   //cout<<"second:"<<second<<endl;
   count++;

   if(!ed1(first,second)){
     //   cout<<"failed check"<<endl;
        check = false;


            }
        }
    }
if (check ==false){cout<<"false"<<endl;return false;}
if (check ==true){cout<<"true"<<endl;return true;}
}

