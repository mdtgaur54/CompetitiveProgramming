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

public class TEAMFORM {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), m = r.ni(), f=0;
			boolean[] a = new boolean[n+2];
			for(int i=0; i<m; i++){
				int u = r.ni(), v = r.ni();
				if(a[u]==true || a[v]== true){
					f = 1;
					break;
				}
				else{
					a[u]=true; a[v] = true;
				}
			}
			if(f==1 || n%2!=0) w.println("no");
			else
				w.println("yes");
			
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}