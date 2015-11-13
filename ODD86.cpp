#include<iostream>
using namespace std;
long long t,start,end;
int main(){
    cin>>t;
    while(t-->0){
        cin>>start>>end;
        cout<<"\n";
        for(int i=start;i<=end;i++){
            if((i%2)==1){
                cout<<i<<"\t";
            }
        }
    }
    return 0;
}
