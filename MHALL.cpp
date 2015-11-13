#include<iostream>
using namespace std;
long long n,t,k,pos;
bool *res;
int main(){
    cin>>t;
    while(t-->0){
        cin>>n;
        res=new bool[n];
        for(int i=0;i<n;i++){
            res[i]=false;
        }
        cin>>k;
        while(k-->0){
            cin>>pos;
            res[pos-1]=true;
        }
        cout<<"\n";
        for(int i=0;i<n;i++){
            if(!res[i]){
                cout<<(i+1)<<"\t";
            }
        }
    }
    return 0;
}
