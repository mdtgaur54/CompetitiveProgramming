package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ARRAYTRM {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), k= r.ni();
			int[] a = r.nia(n);
			int rem1,rem2=-1, c1=1, c2=0, f=0;
			rem1 = a[0]%(k+1);
			for(int i=1;i<n; i++){
				if(a[i]%(k+1)==rem1) c1++;
				else{
					if(rem2==-1){
						rem2=a[i]%(k+1);
						c2++;
					}
					else if(a[i]%(k+1)==rem2) c2++;
					else{
						w.println("NO");
						f=1;
						break;
					}
				}
			}
			if(f==0){
				if(c1>=2 && c2>=2) w.println("NO");
				else w.println("YES");
			}
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}