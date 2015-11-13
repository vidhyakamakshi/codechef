    #include<iostream>
        using namespace std;
        long long n;
        long long l,a,b;
        long long *strength;
        int main(){
            cin>>n>>l;
            strength=new long long[n];
            for(int i=0;i<n;i++){
                cin>>strength[i];
            }
            long long pair=0;
                for(int i=0;i<n;i++){
                    a=strength[i];
                    for(int j=i+1;j<n;j++){
                        b=strength[j];
                        if((a+b)<l){
                            pair++;
                        }
                    }
                }
                cout<<pair;
            return 0;
        }  
