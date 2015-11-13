    #include<iostream>
    using namespace std;
    class spa{
        long long n;
        long long *budget;
        long long revenue;
    public:
        spa(){
            cin>>n;
            budget=new long long[n];
            for(int i=0;i<n;i++){
                cin>>budget[i];
            }
        }
        void compute(){
            long long cust=0;
            long long r=0;
            long long rev=0;
            revenue=0;
            for(int i=0;i<n;i++){
                r=budget[i];
                cust=findcust(r);
                rev=cust*r;
                if(rev>revenue){
                    revenue=rev;
                }
            }
            cout<<revenue;
        }
        long long findcust(long long r){
            long long count=0;
            for(int i=0;i<n;i++){
                if(r<=budget[i]){
                    count++;
                }
            }
            return count;
        }
    };
    int main(){
        spa s;
        s.compute();
    } 
