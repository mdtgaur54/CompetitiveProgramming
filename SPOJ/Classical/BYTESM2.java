package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

class BYTESM2 {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), m = r.ni();
			int[][] a = new int[n][m+2];
			for(int i=0; i<n; i++){
				for(int j=1; j<=m; j++)
					a[i][j]=r.ni();
			}
			for(int i=1; i<=n-1; i++){
				for(int j=1; j<=m; j++){
					a[i][j]+=max(a[i-1][j],a[i-1][j-1],a[i-1][j+1]);
				}
			}
			int ans = a[n-1][1];
			for(int i=2; i<=m; i++){
				if(a[n-1][i]>ans) ans=a[n-1][i];
			}
			w.println(ans);
		}
		w.flush();
	}
	
	static int max(int a, int b, int c){
		if(a>b && a>c) return a;
		if(b>c) return b;
		return c;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}