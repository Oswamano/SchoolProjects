#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>
#include "PeekDeque3MDO.h"

using namespace std;

/** Strings lhs and rhs have Hamming distance 1
 */
bool hd1(const string& lhs, const string& rhs) {
   if (lhs.size() != rhs.size()) { return false; }
   //else
   int count = 0;
   for (int i = 0; i < rhs.size(); i++) {
      if (lhs.at(i) != rhs.at(i)) { count++; }
   }
return count == 1;    //return count <= 1; to include equality.
}

/** Strings lhs and rhs have extension distance 1
REQ: neither string begins or ends with ASCII NUL, \0.
Strings differ by end-char delete if-and-only-if extending the shorter one
by '\0' makes them have Hamming distance 1.  And same for first-char delete.
*/
bool xd1(const string& lhs, const string& rhs) {
if (lhs.size() == rhs.size()) {
return hd1(lhs,rhs);
} else if (lhs.size() == 1 + rhs.size()) {
return hd1(lhs, rhs + string('\0')) || hd1(lhs, string('\0') + rhs);
} else if (1 + lhs.size() == rhs.size()) {
return hd1(lhs + string('\0'), rhs) || hd1(string('\0') + lhs, rhs);
} else {
return false; //strings differ by 2 or more in length.
}
}
//Using a REQ to stipulate lhs.size() < rhs.size(0 would save only one
//if-branch and 1 return line.  IMHO not worth it.


/** Strings lhs and rhs have edit distance 1.  Clean version with no REQ.
*/
bool ed1(const string& lhs, const string& rhs) {
int left = 0;
int right;
if (lhs.size() == rhs.size()) {
return hd1(lhs,rhs);
} else if (lhs.size() == 1 + rhs.size()) {  //check for delete in first string
//LOOP INV: All chars to left of "left" match, and all to right of "right".
//Hence an extra char in lhs will eventually give right <= left.
right = lhs.size() - 1;
while (left < right && lhs.at(left) == rhs.at(left)) { left++; }
while (right > left && lhs.at(right) == rhs.at(right-1)) { right--; }
return right == left;  //all chars matched except this extra one.
} else if (1 + lhs.size() == rhs.size()) {  //check for delete in first string
//LOOP INV: All chars to left of "left" match, and all to right of "right".
//Hence an extra char in rhs will eventually give right <= left.
right = rhs.size() - 1;
while (left < right && lhs.at(left) == rhs.at(left)) { left++; }
while (right > left && lhs.at(right-1) == rhs.at(right)) { right--; }
return right == left;  //all chars matched except this extra one.
} else {
return false;
}
}


bool isLegalChain(PeekDeque<string>* pd2) {
string word;
pd2->setPeekToFront();
bool legal = true;
if (pd2->empty()) {
cout << "File of words was empty." << endl;
//can count as legal chain, so do nothing.
} else {
string prevWord = pd2->peek();
pd2->moveRearward();
while (!(pd2->atRear())) {  //LOOP INV: prevWord is previous word
 word = pd2->peek();
 if (!ed1(prevWord,word)) {
    legal = false;
 }
 prevWord = word;
 pd2->moveRearward();
}
}
return legal;  //RULE: every branch of a non-void function needs a return
}



int main(int argc, char** argv) {
   string word;
   string infileName;
   ifstream* INFILEp;
   cout<< "RAWR";

    //Some help for Assgt. 5
   if (argc >= 3) {   //means filename argument was given
      infileName = argv[1];
      cout<<"penguins";
      INFILEp = new ifstream(infileName.c_str(), ios_base::in);
      //note: it is not allowed to reassign a value stream that way
   }

    vector< PeekDeque<string>* > alpha; // holder vector
    PeekDeque<string>* pd = new PeekDeque<string>(100);

   //while(getline(*INFILEp, word)) {     //OK on A4, not on A5
   while ((*INFILEp) >> word) {
     bool newChain=false;
     cout<<"woof"<<endl;
     for (int i = 0; i< alpha.size();i++){

        string a = alpha[i]->getFront();
        string b = alpha[i]->getRear();
   if(ed1(word,a)){
    newChain=false;
    alpha[i]->pushFront(word);
   }
  else if(ed1(word,b)){
    newChain=false;
    alpha[i]->pushRear(word);
   }
        }

        if (newChain==true){
            PeekDeque<string>* newpd = new PeekDeque<string>(100);
            newpd->pushRear(word);
            alpha.push_back(newpd);
            cout<<"chain"<<endl;
        }



   }
    for (int i = 0; i< 100;i++){
           cout<<i<<endl;}

   INFILEp->close();
   return 0;
}

