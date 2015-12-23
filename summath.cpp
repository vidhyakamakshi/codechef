#include <iostream>
using namespace std;
int t;
long long n;
int main() {
	cin>>t;
	while(t-->0){
	    cin>>n;
	    while((n%10)!=0){
	        n--;
	    }
	    long long s=0;
	    for(int i=n;i>0;i-=10){
	        s+=i;
	    }
	    cout<<s<<"\n";
	}
	return 0;
}
