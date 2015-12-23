import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    long n=Long.parseLong(br.readLine());
		    long[] a=new long[(int)n];
		    for(int i=0;i<n;i++){
		        a[i]=Long.parseLong(br.readLine());
		    }
		    Arrays.sort(a);
		    for(int i=0;i<n;i++){
		        System.out.println(a[i]);
		    }
	}
}
