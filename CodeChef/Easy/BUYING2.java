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

public class BUYING2 {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), x = r.ni();
			int[] a = new int[n];
			int sum = 0;
			for(int i=0; i<n; i++){
				a[i] = r.ni();
				sum+=a[i];
			}
			int rem = sum%x, flag=0;
			for(int i=0; i<n; i++){
				if(rem>=a[i]){
					flag = 1;
					break;
				}
			}
			if(flag==1) w.println(-1);
			else w.println(sum/x);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}