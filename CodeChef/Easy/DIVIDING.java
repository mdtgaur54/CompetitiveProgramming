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

public class DIVIDING {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		long[] a = new long[n+1];
		long sum1=0, sum2=0;
		for(int i=1; i<=n; i++){
			a[i] = r.nl();
			sum1+=i;
			sum2+=a[i];
		}
		if(sum1==sum2)  w.print("YES");
		else w.print("NO");
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}