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

public class NAME2 {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			String s1 = r.next(), s2 = r.next();
			/*if(s1.length()>s2.length()){
				String temp = s1;
				s1=s2;
				s2=temp;
			}*/
			w.println((subSequence(s2,s1)||subSequence(s1,s2))?"YES":"NO");
		}
		w.flush();
	}
	
	private static boolean subSequence(String s1, String s2){
		int j=0;
		for(int i=0; i<s1.length(); i++){
			while(j<s2.length()){
				if(s1.charAt(i)==s2.charAt(j)) break;
				j++;
			}
			
			if(j>s2.length()) return false;
			i++;
			j++;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}