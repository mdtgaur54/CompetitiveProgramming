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

public class ANUDTC {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			if(360%n==0) w.print("y ");
			else w.print("n ");
			if(n<=360) w.print("y ");
			else w.print("n ");
			if((n*(n+1))/2<=360) w.print("y\n");
			else w.print("n\n");
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}