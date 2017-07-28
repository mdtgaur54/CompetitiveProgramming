package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DigitProblem {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		String s = r.next();
		String[] a = s.split("");
		int k = r.ni();
		for(int i=0; i<a.length; i++){
			if(!a[i].equals("9") && k>0){
				sb.append("9");
				k--;
			}
			else sb.append(a[i]);
		}
		w.println(sb);
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}