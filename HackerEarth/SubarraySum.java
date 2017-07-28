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

public class SubarraySum {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int n = r.ni();
		long[] a = r.nla(n);
		long k = r.nl();
		
		long ans = countSubsets(a,n,k);
		
		w.println(ans);
		
		w.flush();
	}
	
	private static long countSubsets(long arr[], int n, long k)
	{
	    long total = 1<<n;
	    long c = 0;
	 
	    for (long i=0; i<total; i++)
	    {
	        long sum = 0;
	 
	        for (int j=0; j<n; j++)
	            if ((i & (1<<j)) == 0)
	                sum += arr[j];
	        System.out.println(sum);       
	 		if(sum>=k) c++;
	    }
	    return c;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}