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

public class ALEXNUMB {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			long n = r.ni();
			long[] a = r.nla(n);
			long ans = (n*(n-1))/2;
			w.println(ans);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}