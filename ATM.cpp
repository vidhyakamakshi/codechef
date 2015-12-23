#include <iostream>
using namespace std;
double b;
int w;
int main() {
	    cin>>w>>b;
	    if((w<=(b-0.5))&&((w%5)==0)){
	        b-=(w+0.5);
	    }
	   cout<<b;
	return 0;
} 
