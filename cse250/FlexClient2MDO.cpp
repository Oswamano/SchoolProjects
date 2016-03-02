/** File "FlexClient2MDO.cpp", by MDO for CSE250,Student Number 50000250 */

#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>
#include "FlexArray2MDO.h"

using namespace std;      

/** Strings lhs and rhs have Hamming distance 1
 */
bool hd1(const string& lhs, const string& rhs) {
   if (lhs.size() != rhs.size()) { return false; }
 
   int count = 0;
   for (int i = 0; i < rhs.size(); i++) {
      if (lhs.at(i) != rhs.at(i)) { count++; }
   }
   return count == 1;    //return count <= 1; to include equality.
}


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

int getLongestChain(vector< FlexArray<string>* >& vec) {
	int longSized = 0;
	for(int i = 0; i < vec.size(); i++) {
		if(vec.at(i)->items()  > longSized) { longSized = vec.at(i)->items(); }
	}
	return longSized;
}

int main(int argc, char** argv) {
   	string word;
        string infileName;
        ifstream* INFILEp;
	cout<<"enteran main"<<endl;
	if (argc >= 3) {   //means filename argument was given ----> 3 used instead of 2 because of './a.out'
		infileName = argv[2];
                INFILEp = new ifstream(infileName.c_str(), ios_base::in);
	cout<<"the cake is a lie"<<endl;
        } else {
		cerr << "No filename specified." << endl;
		return 0;
	cout<<"i heard you you like error mesages"<<endl;
	}
	cout<<"POTASIUM!!!!"<<endl;
   	vector< FlexArray<string>* > overlord;  //the vector to hold each FlexArray "chain"
	
	size_t flexNodeSize = 40;	//size of the vector chunks in each FlexArray node
	int bigWordSize = 0;
	string bigWord;
	
	while ((*INFILEp) >> word) {
		bool needNewChain = true;
		cout<<"WWWHHHIIILLLLLEEE LLLLOOOPPPPP"<<endl;
		if(word.size() > bigWordSize) {
			bigWordSize = word.size();
			bigWord = word;
		}
		cout<<"SSSCCCIIIEEENNNCCCEEEE"<<endl;
		for(int i = 1; i < overlord.size(); i++) {
			FlexArray<string>* currentChain = overlord.at(i);
			FlexArray<string>::iterator itr = currentChain->begin();
			cout<<"For Loop: "<<i<<endl;
			string currentFrontString = *currentChain->at(0);

			string currentRearString = *currentChain->at(currentChain->items());
			
			if(ed1(word, currentFrontString)) { 
				itr = currentChain->begin();
				currentChain->insert(itr, word);
				needNewChain = false; 
				cout<<"if"<<endl;
			}
			else if(ed1(word, currentRearString)) {
				itr = currentChain->rbegin();
				currentChain->insert(itr, word);
				needNewChain = false;
				cout<<"else if"<<endl;
			} else {
				needNewChain = true;
				cout<<"else"<<endl;
			}
		}

		if(needNewChain) {
			FlexArray<string>* newChain = new FlexArray<string>(flexNodeSize);
			FlexArray<string>::iterator itr = newChain->begin();
			newChain->insert(itr, word);
			overlord.push_back(newChain);
			cout<<" A new chain was needed"<<endl;		
		}
	}

	cout << "Finished reading " << infileName << endl;
	cout << "Longest Chain: " << getLongestChain(overlord) << " words" << endl;
	cout << "Longest Word: " << bigWord << endl;
	
   	INFILEp->close();
	return 0;
}

