import java.io.*;
import java.util.*;
 class Suraj {
     public static  void  main(String[] args) throws Exception{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
         while(t-->0){
             int bill=0;
             int n=Integer.parseInt(br.readLine());
             String arr=br.readLine();
             StringTokenizer st=new StringTokenizer(arr);
             int[] cost=new int[n];
             int i=0;
             while(i<n){
                 cost[i]=Integer.parseInt(st.nextToken());
                 i++;
             }
             if(n<=2){
                    int k=0;
                    while(k<n){
                        bill+=cost[k];
                        k++;
                 }
             }
             else if((n>2)&&(n<=4)){
             int k=1;
             for(int l=0;l<n;l++){
                 for(int j=l+1;j<n;j++){
                     if(cost[l]<cost[j]){
                         int temp=cost[l];
                         cost[l]=cost[j];
                         cost[j]=temp;
                     }
                 }
             }
                 k=0;
                 while(k<2){
                     bill+=cost[k];
                     k++;
                 }
             }
             else{
                  int k=1;
                  for(int l=0;l<n;l++){
                 for(int j=l+1;j<n;j++){
                     if(cost[l]<cost[j]){
                         int temp=cost[l];
                         cost[l]=cost[j];
                         cost[j]=temp;
                     }
                 }
             }
                 k=0;
                 while(k<n){
                     if((k%4==0)||(k%4==1)){
                        bill+=cost[k];
                     }
                     k++;
                 }
             }
             System.out.println(bill);
     }
}
}
