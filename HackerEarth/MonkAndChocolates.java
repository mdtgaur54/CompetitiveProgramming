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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MonkAndChocolates {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), k = r.ni();
			String s = r.next();
			ArrayList<Character> al = new ArrayList<Character>();
			for(int i=0; i<n; i++){
				al.add(s.charAt(i));
			}
			Set<Character> set = new HashSet<Character>();
			for(int i=0; i<n; i++)
				set.add(al.get(i));
			int max = 0;
			for(char temp : set){
				int c = Collections.frequency(al, temp);
				if(c>max) max = c;
			}
			
			w.println(max+k);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}