#include <iostream>
using namespace std;
long long n,*a,even,odd,diff;
int main() {
	cin>>n;
	a=new long long[n];
	even=0;
	odd=0;
	for(int i=0;i<n;i++){
	    cin>>a[i];
	    if((a[i]%2)==0){
	        even++;
	    }
	    else{
	        odd++;
	    }
	}
	diff=odd-even;
	if(diff<0){
	    diff=0-diff;
	}
	cout<<diff<<"\n";
	return 0;
}
