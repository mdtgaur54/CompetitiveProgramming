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

public class AdditionIsNotSimple {
	
	
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		
		r.init(System.in);
		int t = r.ni();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<Character> al = new ArrayList<>();
		for(int i=0; i<alpha.length(); i++) al.add(alpha.charAt(i));
		while(t-->0){
			String s= r.next();
			s.toLowerCase();
			StringBuilder sb = new StringBuilder(s);
			StringBuilder sb2 = new StringBuilder();
			String s1 = sb.reverse().toString();
			for(int i=0; i<s.length(); i++){
				int x = al.indexOf(s.charAt(i));
				int y = al.indexOf(s1.charAt(i));
				x = (x+y)%26;
				if(s.charAt(i)=='z')
					sb2.append(s1.charAt(i));
				else if(s1.charAt(i)=='z'){
					sb2.append(s.charAt(i));
				}
				else if(x<25)
					sb2.append(al.get(x+1));
				else{
					x%=25;
					sb2.append(al.get(x));
				}
			}
			w.println(sb2);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}