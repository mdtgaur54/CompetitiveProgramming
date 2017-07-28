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

public class AMSGAME1 {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int[] a = r.nia(n);
			int gcd = GCD(a[0],a[1]);
			if(n>2){
				for(int i=2; i<n; i++){
					gcd = GCD(gcd,a[i]);
				}
			}
			w.println(gcd);
		}
		w.flush();
	}
	
	static private int GCD(int a, int b)
	{
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}