#include <iostream>
using namespace std;
int t,n;
int main() {
	cin>>t;
	while(t-->0){
    	cin>>n;
    	long long sol=0;
    	for(int i=1;i<=n;i++){
    	    for(int j=i+1;j<=n;j++){
    	        long long sum=i+j;
    	        long long product=i*j;
    	        if((product%sum)==0){
    	            sol++;
    	        }
    	    }
    	}
    	cout<<sol<<"\n";
	}
	return 0;
}
