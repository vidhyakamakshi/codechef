import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		   String f=br.readLine();
		   int i=f.length()-1;
		   char ch=f.charAt(i);
		   for(;i>0;i--){
		       ch=f.charAt(i);
		       if((ch!='0')||(ch=='.')){
		           break;
		       }
		   }
		   if(f.charAt(i)=='.'){
		       ch=f.charAt(i-1);
		   }
		   int d=(int)ch-48;
		   if((d%2)==0){
		       System.out.println("even");
		   }
		   else{
		       System.out.println("odd");
		   }
		}
	}
}
