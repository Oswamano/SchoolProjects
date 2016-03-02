/** Matthew O'Connor Student Number 50000250 HomeWork1 mdmMapMDO.cpp*/
#include <string>
#include <iostream>
using namespace std;


int main(){
 //Pointers to Named (Stack) Objects
 string xsphost = "Jello";    //xpshost and ysphost are concrete names
 string ysphost = "Mello";   //in the "Symbol table for the program 
 string* xsp = &xsphost;
 string* ysp = &ysphost;    // Am i supposed to copy comments?
 ysp=xsp;            // copies adress value "5004" as shown in slides
 xsp->at(0)='H';
 cout<<" \nAs stack pointers ; xsp = " << xsp<< " and ysp = " << ysp <<endl;  
 cout<<" ooops!--- forgot to de-reference the pointers..." << endl; 
 cout<<" As stack pointers: *xsp = " << *xsp << " and *ysp = " << *ysp << endl;

 //Pointers to Anonymous (Heap) Objects
 string* xp = new string ("Jello");
 string* yp = new string ("Yello");
 yp=xp;
 xp->at(0)= 'H';
 cout<<" \nAs heap pointers ; xp = " << xp<< " and yp = " << yp <<endl;
 cout<<" ooops!--- forgot to de-reference the pointers..." << endl;
 cout<<" As stack pointers: *xp = " << *xp << " and *yp = " << *yp << endl;  

 return (0);
}
