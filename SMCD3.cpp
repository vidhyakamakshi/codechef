#include<iostream>
using namespace std;
long long t,n,s;
int main(){
	cin>>t;
	while(t-->0){
		cin>>n;
		s=(n*(n+1))/2;
		cout<<s<<"\n";
	}
	return 0;
}
