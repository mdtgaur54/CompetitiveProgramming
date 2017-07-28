package HackerEarth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ShilandSquareSum {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int n = r.ni(), k = r.ni();
		Queue<Long> queue = new LinkedList<>();
		for(int i=0; i<n; i++)
			queue.add(r.nl());
		n = n-k+1;
		long ans  = 0, mod = 1000000007;
		for(int j=1;j<n; j++)
		
		w.print(sb);
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}