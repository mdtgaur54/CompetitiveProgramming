package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ETF {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int fi = fi(n);
			w.println(fi);
		}
		w.flush();
	}
	
	static int fi(int n){
		int result=n;
		for(int i=2; i*i<=n; i++){
			if(n%i==0) result-=result/i;
			while(n%i==0)n/=i;
		}
		if(n>1) result-=result/n;
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}