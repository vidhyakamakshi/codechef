#include<iostream>
using namespace std;
long long t,start,end,f;
long long factor(long long n);
int main(){
    cin>>t;
    while(t-->0){
        cin>>start>>end;
        cout<<"\n";
        for(int i=start;i<=end;i++){
            f=factor(i);
            if(f>2){
                cout<<i<<"\t";
            }
        }
    }
    return 0;
}
long long factor(long long n){
    long long fac=0;
    for(int i=1;i<=n;i++){
        if((n%i)==0){
            fac++;
        }
    }
    return fac;
}
