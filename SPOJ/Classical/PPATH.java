package SPOJ.Classical;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PPATH {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		int[] p =primeGenerator();
		while(t-->0){
			int m = r.ni(), n = r.ni();
			int[] digit = new int[4];
			Queue<Integer> q = new LinkedList<>();
			int[] dist = new int[10005];
			Arrays.fill(dist,-1);
			boolean[] visit = new boolean[10005];
			if(m==n){ w.println(0); continue;}
			q.add(m);
			dist[m]=0;
			visit[m]=true;
			while(!q.isEmpty()){
				int val = q.poll();
				if(val==n) break;
				for(int i=0; i<4; i++){
					conv_to_arr(digit,val);
					for(int j=0; j<10; j++){
						digit[i]=j;
						int temp = conv_to_num(digit);
						if(!visit[temp] && p[temp]==1 && temp>=1000){
							visit[temp]=true;
							q.add(temp);
							dist[temp]=dist[val]+1;
						}
					}
				}
			}
			if(dist[n]==-1) w.println("impossible");
			else w.println(dist[n]);
		}
		w.flush();
	}
	
	static int[] primeGenerator(){
        int a = 10005;
        int[] p = new int[a+1];
	    for(int i=0; i<=a; i++){
	        p[i]=1;
	    }
	    p[0]=0;
	    p[1]=0;
	    for(int i=2; i<=Math.sqrt(a); i++){
	        if(p[i]==1){
	            for(int j=2; i*j<=a; j++){
	                p[i*j]=0;
	            }
	        }
	    }
	    return p;
	}
	
	static int conv_to_num(int a[])
	{
	 int n;
	 n = (a[3] *1000)  + (a[2] *100)   + (a[1] * 10) + (a[0]);
	 return n;
	}

	static void conv_to_arr(int digit[],int n)
	{
	    digit[0] = n%10;
	    n /= 10;
	    digit[1] = n%10;
	    n /= 10;
	    digit[2] = n%10;
	    n /= 10;
	    digit[3] = n%10;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}