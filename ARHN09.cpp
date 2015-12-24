#include <iostream>
using namespace std;
long long n,q,*a,l,r;
char cmd[5];
int main() {
	cin>>n>>q;
	a=new long long[n];
	for(int i=0;i<n;i++){
	    cin>>a[i];
	}
	while(q-->0){
	    cin>>cmd>>l>>r;
	    long long sum=0;
	    for(int i=l-1;i<r;i++){
	        sum+=a[i];
	    }
	   cout<<sum<<"\n"; 
	}
	return 0;
}
