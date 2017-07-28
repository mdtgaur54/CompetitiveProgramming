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

public class SNAKPROC {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int T = r.ni();
		while(T-->0){
			int n = r.ni(), h=0, t=0, f=0;
			String s = r.next();
			for(int i=0; i<n; i++){
				if(s.charAt(i)=='H'){ 
					if(h>t){
						w.println("Invalid");
						f=1;
						break;
					}
					h++;
				}
				else if(s.charAt(i)=='T') t++;
				if(t>h){
					w.println("Invalid");
					f=1;
					break;
				}
			}
			if(f==0){
				if(h==t) w.println("Valid");
				else w.println("Invalid");
			}
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}