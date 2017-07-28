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

public class RIGHTRI {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni(), ans=0;
		int i = 1;
		while(n-->0){
			int x1 = r.ni(), y1 = r.ni(), x2 = r.ni(), y2 = r.ni(), x3 = r.ni(), y3 = r.ni();
			int a = (int)Math.pow((x2-x1), 2)+(int)Math.pow((y2-y1), 2);
			int b = (int)Math.pow((x3-x2), 2)+(int)Math.pow((y3-y2), 2);
			int c = (int)Math.pow((x3-x1), 2)+(int)Math.pow((y3-y1), 2);
			if(c<a){
				a=(a+c)-(c=a);
			}
			if(c<b){
				b=(b+c)-(c=b);
			}
			if(a+b==c) ans++;
		}
		w.println(ans);
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}