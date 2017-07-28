package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HUBULLU {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		long t = r.nl();
		while(t-->0){
			long n = r.nl();
			int p = r.ni();
			if(p==0) w.println("Airborne wins.");
			else w.println("Pagfloyd wins.");
		}
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}