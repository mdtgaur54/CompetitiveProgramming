package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FARIDA {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		for(int k=1; k<=t; k++){
			int n = r.ni();
			long[] a = new long[1001];
			long[] b = new long[1001];
			for(int i=0; i<n; i++) a[i]=r.nl();
			b[0]=a[0];
			b[1]=a[1];
			for(int i=2; i<n; i++){
				for(int j=0; j<i-1; j++){
					if(b[i]<a[i]+b[j]) b[i]=a[i]+b[j];
				}
			}
			long max=0;
			for(int i=0; i<n; i++){
				if(max<b[i]) max=b[i];
			}
			w.println("Case "+k+":"+" "+max);	
		}
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}