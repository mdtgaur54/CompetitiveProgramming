package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AMR10G {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			long n = r.nl();
			long k = r.nl();
			long[] a = new long[(int)n];
			for(int i=0; i<n; i++)
				a[i]=r.nl();
			Arrays.sort(a);
			int min=Integer.MAX_VALUE;
			for(int i=0; i<=(n-k); i++){
				if(min>a[(int)(i+k-1)]-a[i])
					min=(int)(a[(int)(i+k-1)]-a[i]);
			}
			w.println(min);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}