package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class LonelyMonk {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int n = r.ni(), k = 2;
		long sum = 0,  ans = 0;
		long[] count = new long[k];
		int[] a = r.nia(n);
		count[0]=1;
		for(int i=0; i<n; i++){
			sum=((sum+a[i])%k+k)%k;
			count[(int)sum]++;
		}
		
		for(int i=0; i<k; i++){
			//w.println(count[i]+" ");
			if(count[i]>1)
				ans+=(count[i]*(count[i]-1))/2;
		}
		//ans+=count[0];
		
		w.println(ans);
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}