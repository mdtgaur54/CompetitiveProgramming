package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class LittleShinoAndTheCoins {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int k = r.ni(), c = 0;
		String s = r.next();
		
		for(int i=0; i<=s.length()-k; i++){
			Set<Character> set = new HashSet<>();
			for(int j=i; j<s.length(); j++){
				set.add(s.charAt(j));
				//w.println(set);
				if(set.size()==k) c++;
			}
		}
		
		w.println(c);
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}