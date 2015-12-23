#include<iostream>
using namespace std;
int t,n;
int main(){
        cin>>t;
        while(t-->0){
            cin>>n;
            long long f=1;
            for(int i=1;i<=n;i++){
                f*=i;
            }
            cout<<f<<"\n";
        }
        return 0;
}
