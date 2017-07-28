package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DOTAA {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t=r.ni();
		while(t-->0){
			int n = r.ni(), m = r.ni(), d = r.ni();
			int[] a = new int[n];
			int count=0;
			for(int i=0; i<n; i++){
				a[i]=r.ni();
				while((a[i]-=d)>0) count++;
			}
			if(count>=m) w.println("YES");
			else w.println("NO");
		}
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}