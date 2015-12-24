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
    		TreeSet ts=new TreeSet();
    		String ds=br.readLine();
    		StringTokenizer st=new StringTokenizer(ds);
    		for(int i=0;i<n;i++){
    		    ts.add(new Integer(Integer.parseInt(st.nextToken())));
    		}
    		if(ts.size()==n){
    		    System.out.println("YES");
    		}
    		else{
    		    System.out.println("NO");
    		}
		}
	}
}
