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

public class SagarLearning {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int t = r.ni();
		
		while(t-->0){
			long n = r.nl();
			if(n>=3){
				w.println((n/3)+" "+(n/3)*2+" "+(n/3)*3);
			} else w.println(-1);
		}
		
		
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}