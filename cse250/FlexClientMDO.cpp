// Matt O'Connor 5000250

#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string>
#include <vector>
#include <fstream>
#include <sstream>
#include "FlexArrayMDO.h"
#include "StringWrap.h"
#include <algorithm>
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

bool isValidInteger(string x) {
for(int i =0; i < x.length(); i++) {
if(x[i] < '0' || x[i] > '9')
return false;
}
return true;
}

int main(int argc, char** argv) {
if(argc < 2 || argc > 3) {

exit(EXIT_FAILURE);
}

string infileName = argv[1];
int n = -1;
if(argc == 3) {
string num = argv[2];
if(!isValidInteger(num)) {
cout <<"Invalid" << endl;
exit(EXIT_FAILURE);
}
n = atoi(argv[2]);
}
ifstream* INFILEp = new ifstream(infileName.c_str(), ios_base::in);
if(INFILEp == NULL) {
cout << "textless" << endl;
exit(EXIT_FAILURE);
}


vector< FlexArray<string> *> faVec;

FlexArray<string>* fa= new FlexArray<string>(100);
faVec.push_back(fa);

string word;
int m = n - abs(n);

*INFILEp >> word;
StringWrap* sw_1 = new StringWrap(word);
sw_1->trimNonAlpha();
sw_1->makeLower();
word = sw_1->str();
fa->insert(fa->begin(), word);
while ((*INFILEp) >> word && m < n) {
if(word.length() > 2) {
StringWrap* sw = new StringWrap(word);
sw->trimNonAlpha();

sw->makeLower();
word = sw->str();
bool hasAppeared = false;
for(int i = 0; i < faVec.size(); i++) {
FlexArray<string>* curFa = faVec[i];
FlexArray<string>::iterator it = curFa->begin();
while(!curFa->isTheEnd(it)) {
string curWord = curFa->at(it);
if(curWord == word)
hasAppeared = true;
it = it.operator++(9);
}
}
if(!hasAppeared) {
bool isNew = true;
for(int i = 0; i < faVec.size(); i++) {
FlexArray<string>* curFa = faVec[i];
FlexArray<string>::iterator it = curFa->begin();
while(!curFa->isTheEnd(it)) {
string curWord = curFa->at(it);
if(ed1(curWord, word)) {
curFa->insert(it, word);
isNew = false;
break;
}
it = it.operator++(9);
}
}
if(isNew) {
FlexArray<string>* faNew = new FlexArray<string>(100);
faNew->insert(faNew->begin(), word);
faVec.push_back(faNew);
}
}
}
if(m >= 0)
m++;
}

vector< FlexArray<string>* > soBig;
vector<string> longestWords;
int maxDif = 0;

FlexArray<string>* curFa;
for(int i = 0; i < faVec.size(); i++) {
FlexArray<string>* curFa = faVec[i];
FlexArray<string>::iterator it = curFa->begin();
int shortestLength = curFa->at(it).length();
int greatestLength = curFa->at(it).length();
string longestWord = curFa->at(it);
int count = 0;
while(!curFa->isTheEnd(it)) {
string curWord = curFa->at(it);
if(curWord.length() < shortestLength)
shortestLength = curWord.length();
else if(curWord.length() > shortestLength) {
greatestLength = curWord.length();
longestWord = curWord;
}
count++;
it = it.operator++(42);
}

if(count >= 2) {
if(greatestLength-shortestLength > maxDif) {
soBig.clear();
maxDif = greatestLength - shortestLength;
soBig.push_back(curFa);
} else if (greatestLength-shortestLength == maxDif) {
soBig.push_back(curFa);
}
longestWords.push_back(longestWord);
}
}


cout << "Chains with longest word differences" << endl;


for(int i = 0; i < soBig.size(); i++) {
curFa = soBig[i];
FlexArray<string>::iterator it = curFa->begin();
cout << "New Chain:" << endl;
while(!curFa->isTheEnd(it)) {
cout << curFa->at(it) << endl;
it = it.operator++(69);
}
}
cout << endl;

cout << "Longest words in chains" << endl;

for(int i = 0; i < longestWords.size(); i++) {
cout << longestWords[i] << endl;
}


INFILEp->close();
}

// Iterators are better because they can transverse a dynamic data structure.
// There was no noticeable speed change.
