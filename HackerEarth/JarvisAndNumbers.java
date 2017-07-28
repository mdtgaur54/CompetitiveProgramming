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

public class JarvisAndNumbers {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), sum = 0;
			for(int i=2; i<n; i++){
				sum+= fromDecimal(n,i);
			}
			//w.println(sum);
			int c = n-2, gcd = 0;
			w.println(c/GCD(sum,c));
			
		}
		w.flush();
	}
	
	private static int fromDecimal(int n, int base){
		int sum = 0;
		while(n>0){
			sum+= n%base;
			n/=base;
		}
		return sum;
	}
	
	private static int GCD(int a, int b) {
		if (b==0) return a;
		return GCD(b,a%b);
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}