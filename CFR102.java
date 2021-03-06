import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   String dob=br.readLine();
		   StringTokenizer st=new StringTokenizer(dob);
		   int d=Integer.parseInt(st.nextToken());
		   String month=st.nextToken();
		   int y=Integer.parseInt(st.nextToken());
		   int m;
		   if(month.equalsIgnoreCase("January")){
		       m=1;
		   }
		   else if(month.equalsIgnoreCase("february")){
		       m=2;
		   }
		   else if(month.equalsIgnoreCase("march")){
		       m=3;
		   }
		   else if(month.equalsIgnoreCase("april")){
		       m=4;
		   }
		   else if(month.equalsIgnoreCase("may")){
		       m=5;
		   }
		   else if(month.equalsIgnoreCase("june")){
		       m=6;
		   }
		   else if(month.equalsIgnoreCase("july")){
		       m=7;
		   }
		   else if(month.equalsIgnoreCase("august")){
		       m=8;
		   }
		   else if(month.equalsIgnoreCase("september")){
		       m=9;
		   }
		   else if(month.equalsIgnoreCase("october")){
		       m=10;
		   }
		   else if(month.equalsIgnoreCase("november")){
		       m=11;
		   }
		   else{
		       m=12;
		   }
		   long s=(d*m)+y;
		   System.out.println(Codechef.f(s));
	}
	public static long f(long n){
        if(n<10){
            return n;
        }
        else{
            long s=0;
            while(n>0){
                s+=n%10;
                n/=10;
            }
            return f(s);
        }
    }
}
