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

public class NGM {
	private static void solve() throws IOException{
		Parser r = new Parser();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		//r.init(System.in);
		int n = r.nextInt();
		if(n%10==0)
			w.println("2");
		else{
			w.println("1\n"+n%10);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}