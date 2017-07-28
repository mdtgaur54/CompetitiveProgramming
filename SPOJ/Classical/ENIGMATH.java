package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ENIGMATH {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int a = r.ni(), b = r.ni();
			int gcd = GCD(a,b);
			if(gcd==1)
				a = (a+b)-(b=a);
			else{
				a/=gcd;
				b/=gcd;
				a = (a+b)-(b=a);
			}
			w.println(a+" "+b);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
	
	static public int GCD(int a, int b)
	{
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
}