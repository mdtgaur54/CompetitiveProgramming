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
import java.util.stream.IntStream;

public class SEAVOTE {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), c=0;
			int[] a = new int[n];
			for(int i=0; i<n; i++){
				a[i] = r.ni();
				if(a[i]>0) c++;
			}
			int sum = IntStream.of(a).sum();
			if(sum<100) w.println("NO");
			else if(sum==100) w.println("YES");
			else{
				int x = sum-100;
				if(x<c) w.println("YES");
				else w.println("NO");
			}
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}