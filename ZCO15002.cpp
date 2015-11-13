        #include<iostream>
    using namespace std;
    long long n;
    long long k,a,b,d;
    long long *seq;
    int main(){
        cin>>n>>k;
        seq=new long long[n];
        for(int i=0;i<n;i++){
            cin>>seq[i];
        }
        long long total=0;
            for(int i=0;i<n;i++){
                a=seq[i];
                for(int j=i+1;j<n;j++){
                    b=seq[j];
                    if(a>=b){
                        d=a-b;
                    }
                    else{
                        d=b-a;
                    }
                    if(d>=k){
                            total++;
                        }
                }
            }
            cout<<total;
        return 0;
    } 
