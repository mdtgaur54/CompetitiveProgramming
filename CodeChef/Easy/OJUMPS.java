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

public class OJUMPS {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		long n = r.nl();
		if(n%6==0 || n%6==1 || n%6==3) w.println("yes");
		else w.println("no");
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}