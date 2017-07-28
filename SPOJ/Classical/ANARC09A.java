package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;

public class ANARC09A {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		r.init(System.in);
		int k=1;
		while(true){
			String s = r.next();
			if(s.charAt(0)=='-') break;
			/*Stack<Character> st = new Stack<>();
			int ans=0;
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='{')
					st.push('{');
				else if(s.charAt(i)=='}' && !st.empty())
					st.pop();
				else{
					st.push('}');
					ans++;
				}
					
			}
			ans=ans+st.size()/2;
			w.println(k+". "+ans);
			k++;*/
			
			int c=0, ans=0;
			for(int i=0; i<s.length(); i++){
				if(s.charAt(i)=='{')
					c++;
				else if(c>0) c--;
				else{
					c++;
					ans++;
				}
				w.println(s.charAt(i)+" "+c+" "+ans);
			}
			
			ans+=c/2;
			w.println(k+". "+ans);
			k++;
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}