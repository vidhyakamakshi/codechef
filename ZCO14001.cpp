    #include<iostream>
    using namespace std;
    class vg{
        long long n;
        long long h;
        long long *stk;
        long long pos;
        bool hasBox;
    public:
        vg();
        void play();
        void pick();
        void drop();
        void mleft();
        void mright();
        void display();
    };
    vg::vg(){
        cin>>n>>h;
        stk=new long long[n];
        for(int i=0;i<n;i++){
            cin>>stk[i];
        }
        pos=0;
        hasBox=false;
    }
    void vg::play(){
        int cmd;
        while(true){
            cin>>cmd;
            if(cmd==0){
                break;
            }
            else if(cmd==1){
                mleft();
            }
            else if(cmd==2){
                mright();
            }
            else if(cmd==3){
                pick();
            }
            else {
                drop();
            }
        }
        display();
    }
    void vg::mleft(){
        if(pos!=0){
            pos--;
        }
    }
    void vg::mright(){
        if(pos!=(n-1)){
            pos++;
        }
    }
    void vg::pick(){
        if((stk[pos]!=0)&&(!hasBox)){
            stk[pos]--;
            hasBox=true;
        }
    }
    void vg::drop(){
        if((stk[pos]<h)&&(hasBox)){
            stk[pos]++;
            hasBox=false;
        }
    }
    void vg::display(){
        cout<<"\n";
        for(int i=0;i<n;i++){
            cout<<stk[i]<<"\t";
        }
    }
    int main(){
        vg v;
        v.play();
        return 0;
    } 
