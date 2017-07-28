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

public class TEMPLELA {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), f=0;
			int[] a = r.nia(n);
			if(n%2==0 || a[0]!=1 || a[n-1]!=1) w.println("no");
			else{
				for(int i=0, j=a.length-1; i<n/2; i++,j--){
					if(a[i]+1!=a[i+1] || a[j]+1!=a[j-1]){
						f=1;
						w.println("no");
						break;
					}
				}
				if(f==0) w.println("yes");
			}
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}