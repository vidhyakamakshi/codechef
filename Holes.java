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
		        int l=n.length();
		        long h=0;
		        for(int i=0;i<l;i++){
		            char ch=n.charAt(i);
		            if((ch=='A')||(ch=='D')||(ch=='O')||(ch=='P')||(ch=='R')){
		                h++;
		            }
		            else if(ch=='B'){
		                h+=2;
		            }
		        }
		        System.out.println(h);
		    }
	}
}
