package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class AND {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		long[] a = r.nla(n);
		long sum =0;
		ArrayList<Long> al = new ArrayList<>();
		
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				sum = a[i] & a[j];
				al.add(sum);
			}
		}
		w.println(al);
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}