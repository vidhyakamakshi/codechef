#include <iostream>
using namespace std;
int t;
long long l,w;
long long gcd(long long n1,long long n2);
bool prime(long long n);
int main() {
	// your code goes here
	cin>>t;
	while(t-->0){
	    cin>>l>>w;
	    long long c=0;
	    for(int i=1;i<=l;i++){
	       for(int j=1;j<=w;j++){
	           if(prime(gcd(i,j))){
	               c++;
	           }
	       }
	   }
	    cout<<c<<"\n";
	}
	return 0;
}
long long gcd(long long n1,long long n2){
    return n2==0?n1:gcd(n2,n1%n2);
}
bool prime(long long n){
    long long f=0;
    for(int i=1;i<=n;i++){
        if((n%i)==0){
            f++;
        }
    }
    if(f==2){
        return true;
    }
    else{
        return false;
    }
}
