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

public class RESQ {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), ans=Integer.MAX_VALUE;
			for(int i=(int) Math.sqrt(n); i>=1; i--){
				if(n%i==0){
					int d = n/i;
					ans= d-i;
					break;
				}
			}
			w.println(ans);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}