import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    long t=Long.parseLong(br.readLine());
		    while(t-->0){
		        String n=br.readLine();
		        long r=Long.parseLong(new StringBuilder(n).reverse().toString());
		        if((r%2)==0){
		            System.out.println("EVEN");
		        }
		        else{
		            System.out.println("ODD");
		        }
		    }
	}
}
