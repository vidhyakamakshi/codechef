#include<iostream>
using namespace std;
long long n;
long long *strength;
int main(){
    cin>>n;
    strength=new long long[n];
    for(int i=0;i<n;i++){
        cin>>strength[i];
    }
    long long total=0;
    long long a=0;
    long long b=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                a=strength[i];
                b=strength[j];
                if(a>=b){
                    total+=(a-b);
                }
                else{
                    total+=(b-a);
                }
            }
        }
        cout<<total;
    return 0;
}
