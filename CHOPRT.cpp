#include<iostream>
using namespace std;
long long t,a,b;
int main(){
    cin>>t;
    while(t-->0){
        cin>>a>>b;
        if(a<b){
            cout<<"\n <";
        }
        else if(a>b){
            cout<<"\n >";
        }
        else{
            cout<<"\n =";
        }
    }
    return 0;
}
