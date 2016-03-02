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
      infileName = argv[2];
      cout<<"penguins";
      INFILEp = new ifstream(infileName.c_str(), ios_base::in);
      //note: it is not allowed to reassign a value stream that way
   }

            vector< PeekDeque<string>* > master;  //the vector to hold each PeekDeque "chain"

        while ((*INFILEp) >> word) {
                bool needNewChain = true;
                int maxChainWords = 100; //forces create a new chain to prevent out of bounds errors
                int longestWordSize = 0;
                string longestWord;

                if(word.size() > longestWordSize) {

                }

                for(int i = 0; i < master.size(); i++) {
                        PeekDeque<string>* currentChain = master.at(i);

                        currentChain->setPeekToFront();
                        string currentFrontString = currentChain->peek();
                        cout<<i;
                        currentChain->setPeekToRear();
                        string currentRearString = currentChain->peek();
                        cout<<currentRearString<<endl;  
                        if(currentChain->size() >= maxChainWords) {
                                needNewChain = true;
                                break;
                        }
                        else if(ed1(word, currentFrontString)) {
                                currentChain->pushFront(word);
                                needNewChain = false;
                        }
                        else if(ed1(word, currentRearString)) {
                                currentChain->pushRear(word);
                                needNewChain = false;
                        }
                }
                if(needNewChain) {
                        PeekDeque<string>* newChain = new PeekDeque<string>(maxChainWords);
                        newChain->pushFront(word);
                        master.push_back(newChain);
                }
        }

        cout << "Finished reading " << infileName << endl;
//        cout << "Longest Chain: " << getLongestChain(master) << " words" << endl;
  //      cout << "Longest Word: " << longestWord << endl;

        INFILEp->close();
        return 0;
}

