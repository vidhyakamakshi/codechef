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
		   int n=Integer.parseInt(br.readLine());
		   String[] url=new String[n];
		   boolean stage=false;
		   boolean unstage=false;
		   for(int i=0;i<n;i++){
		       url[i]=br.readLine();
		       if((stage)&&(url[i].contains("unstage"))){
		           unstage=true;
		       }
		       else if((url[i].contains("stage"))&&(!url[i].contains("unstage"))){
		           stage=true;
		       }
		   }
		   if((stage)&&(unstage)){
		       System.out.println("2");
		   }
		   else if(stage){
		       System.out.println("1");
		   }
		   else{
		       System.out.println("0");
		   }
		}
	}
}
