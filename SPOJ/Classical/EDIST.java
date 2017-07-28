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

public class EDIST {
	
	static int editDistance(String s1, String s2){
		int m = s1.length(), n = s2.length();
		int[][] sol = new int[m+1][n+1];
		for(int i=0; i<=n; i++) sol[0][i]=i;
		for(int i=0; i<=m; i++) sol[i][0]=i;
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)) 
					sol[i][j] = sol[i-1][j-1];
				else
					sol[i][j] = 1+Math.min(sol[i][j-1], Math.min(sol[i-1][j], sol[i-1][j-1]));
			}
			
		}
		return sol[m][n];
	}
	
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			String s1 = r.next();
			String s2 = r.next();
			int ans = editDistance(s1, s2);
			w.println(ans);
		}
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}