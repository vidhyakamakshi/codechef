import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String str=br.readLine();
		    int n=str.length();
		    System.out.println(str);
		    for(int i=1;i<n;i++){
		        if(i!=1){
		            System.out.println();
		        }
		        for(int j=i;j<n;j++){
		            System.out.print(str.charAt(j));
		        }
		    }
		}
	}
}
