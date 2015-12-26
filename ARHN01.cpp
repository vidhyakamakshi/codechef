#include <iostream>
using namespace std;
long long a1,a2,a3,nt;
bool checkAP(long long x,long long y,long long z);
int main() {
	// your code goes here
    while(true){
        cin>>a1>>a2>>a3;
        if((a1==0)&&(a2==0)&&(a3==0)){
            break;
        }
        if(checkAP(a1,a2,a3)){
           nt=(2*a3)-a2; 
           cout<<"AP "<<nt<<"\n";
        }
        else{
            nt=(a3*a3)/a2; 
            cout<<"GP "<<nt<<"\n";
        }
    }
	return 0;
}
bool checkAP(long long x,long long y,long long z){
    long long d1=y-x;
    long long d2=z-y;
    if(d1==d2){
        return true;
    }
    else{
        return false;
    }
}
