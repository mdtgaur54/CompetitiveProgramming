package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MAXDIFF {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), k = r.ni();
			int[] a = r.nia(n);
			Arrays.sort(a);
			long sum1 = 0, sum = 0;
			int m = Math.max(k, n-k);
			int c = 0, i=n-1;;
			while(c!=m){
				sum1+=a[i];
				i--;
				c++;
			}
			sum = Arrays.stream(a).sum();
			long ans = sum1 - (sum-sum1);
			w.println(ans);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}