#include <iostream>
using namespace std;
int t;
long long n;
int min(int a,int b);
int main() {
	// your code goes here
	cin>>t;
	while(t-->0){
	    cin>>n;
	    if(n<0){
	        n=0-n;
	    }
	    int mod=n%9;
	    if(mod!=0){
	        int alt=9-mod;
	        cout<<min(alt,mod)<<"\n";
	    }
	    else{
	        cout<<"0 \n";
	    }
	}
	return 0;
}
int min(int a,int b){
    if(a<=b){
        return a;
    }
    else{
        return b;
    }
}
