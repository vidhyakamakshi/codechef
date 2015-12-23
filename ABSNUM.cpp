#include <iostream>
using namespace std;
long long n,t;
int main() {
    cin>>t;
    while(t-->0){
	    cin>>n;
	    if(n<0){
	        n=0-n;
	    }
	    cout<<n<<"\n";
    }
	    return 0;
}
