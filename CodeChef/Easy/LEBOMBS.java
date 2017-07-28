package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class LEBOMBS {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int c = 0;
			String s = r.next();
			int[] a = new int[n+2];
			int k=0;
			for(int i=1; i<=n; i++){
				a[i] = Character.getNumericValue(s.charAt(k++));
			}
			boolean[] ar = new boolean[n+2];
			for(int i=1; i<=n; i++){
				if(a[i]==1) {
					ar[i-1] = true;
					ar[i+1] = true;
					ar[i] = true;
				}
			}
			for(int i=1; i<=n; i++){
				if(ar[i]==false) c++;
			}
			w.println(c);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}