#include <iostream>
using namespace std;
long long x,y;
long long f(long long n);
int main() {
	cin>>x>>y;
	long long max=0;
	for(int i=x;i<y;i++){
	    long long m=f(i);
	    if(m>max){
	        max=m;
	    }
	}
	cout<<max<<"\n";
	return 0;
}
long long f(long long n){
    if(n==1){
        return n;
    }
    else if((n%2)==0){
        return f(n/2);
    }
    else{
        return (f(n/2)+1);
    }
}
