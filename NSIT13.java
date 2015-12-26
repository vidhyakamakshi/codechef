import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=10;
		while (t-->0){
		    TreeSet ts=new TreeSet();
		    for(int i=0;i<10;i++){
		        ts.add(new Integer((Integer.parseInt(br.readLine()))%42));
		    }
		    System.out.println(ts.size());
		} 
	}
}
