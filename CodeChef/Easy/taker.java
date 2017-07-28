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

public class taker {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			String s = Integer.toString(n);
			if(s.contains("21") || n%21==0) w.println("The streak is broken!");
			else w.println("The streak lives still in our heart!");
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}