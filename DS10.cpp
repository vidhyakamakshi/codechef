#include <iostream>
using namespace std;
long long n;
int main() {
	    cin>>n;
	    long long s=0;
	    for(int i=1;i<n;i++){
	        if((n%i)==0){
	            s+=i;
	        }
	    }
	    cout<<s<<"\n";
	    return 0;
}
