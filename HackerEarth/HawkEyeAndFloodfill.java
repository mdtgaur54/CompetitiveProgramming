package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class HawkEyeAndFloodfill {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int n = r.ni();
		int a = r.ni(), b = r.ni(), p = r.ni();
		int[][] ar = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a==i && b==j) ar[i][j] = p;
				else{
					int d1 = Math.abs(i-a);
					int d2 = Math.abs(j-b);
					if(d1>d2){
						int x = p-d1;
						if(x<0) ar[i][j] = 0;
						else ar[i][j] = x;
					} else{
						int x = p-d2;
						if(x<0) ar[i][j] = 0;
						else ar[i][j] = x;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				w.print(ar[i][j]+" ");
			}
			w.println();
		}
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}