import java.io.*;
import java.util.*;
class ACM14KN4 {
	BufferedReader br;
	StringTokenizer st;
	Scanner sc;
	long M;
	long N;
	long D[];
	long x;
	long y;
	public static void main(String[] args) {
		new ACM14KN4().simulate();
	}
	public void simulate() {
		boolean flag=true;
		sc=new Scanner(System.in);
		String nmip=sc.nextLine();
		st=new StringTokenizer(nmip);
		N=Long.parseLong(st.nextToken());
		M=Long.parseLong(st.nextToken());
		if((N>=1)&&(N<=100000)&&(M>=1)&&(M<=500000)){
			D=new long[(int) N];
			String dval=sc.nextLine();
			st=new StringTokenizer(dval);
			int dcount=st.countTokens();
			if(dcount==N){
				for(int i=0;i<N;i++){
					D[i]=Long.parseLong(st.nextToken());
					if((D[i]>=1)&&(D[i]<=1000000000)){
						
					}
					else{
						System.out.println("D value not satisfy specified constraints");
						flag=false;
					}
				}
				if(flag){
					for(int j=0;j<M;j++){
						String oper=sc.nextLine();
						st=new StringTokenizer(oper);
						analyse(st);
					}
				}
			}
		}
	}
	private void analyse(StringTokenizer st2) {
		String cmd=st2.nextToken();
		if(cmd.equalsIgnoreCase("U")){
			int ind=Integer.parseInt(st2.nextToken());
			long nv=Long.parseLong(st2.nextToken());
			if((nv>=1)&&(nv<=1000000000)&&(ind<=N)){
				update(ind-1, nv);
			}
		}
		else{
			int sind=Integer.parseInt(st2.nextToken());
			int eind=Integer.parseInt(st2.nextToken());
			if((sind<=N)&&(eind<=N)&&(sind<=eind)){
				if(cmd.equalsIgnoreCase("M")){
					mostDifficult(sind-1, eind-1);
				}
				else if(cmd.equalsIgnoreCase("S")){
					totalTime(sind-1, eind-1);
				}
				else if(cmd.equalsIgnoreCase("I")){
					increasing(sind-1, eind-1);
				}
				else if(cmd.equalsIgnoreCase("D")){
					decreasing(sind-1, eind-1);
				}
				else{
					System.out.println("Invalid operation code");
				}
			}
		}
	}
	public void update(int index,long newval){
		D[index]=newval;
	}
	public void mostDifficult(int startIndex,int endIndex){
		long max=D[startIndex];
		for(int i=startIndex;i<=endIndex;i++){
			if(D[i]>max){
				max=D[i];
			}
		}
		System.out.println(max);
	}
	public void increasing(int startIndex,int endIndex){
		boolean flag=true;
		for(int i=startIndex;i<=endIndex;i++){
			for(int j=i+1;j<=endIndex;j++){
				if(D[i]>D[j]){
					flag=false;
					break;
				}
			}
		}
			if(flag){
				System.out.println("1");
			}
			else{
				System.out.println("0");
			}
	}
	public void decreasing(int startIndex,int endIndex){
		boolean flag=true;
		for(int i=startIndex;i<=endIndex;i++){
			for(int j=i+1;j<=endIndex;j++){
				if(D[i]<D[j]){
					flag=false;
					break;
				}
			}
		}
			if(flag){
				System.out.println("1");
			}
			else{
				System.out.println("0");
			}
	}
	public void totalTime(int startIndex,int endIndex){
		long total=0;
		for(int i=startIndex;i<=endIndex;i++){
			total+=D[i];
		}
		System.out.println(total);
	}
}
