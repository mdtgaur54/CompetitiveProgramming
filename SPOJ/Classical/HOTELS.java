package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HOTELS {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		long m = r.nl();
		long[] a = r.nla(n);
		w.println(subArraySum(a,n,m));
		w.flush();
	}
	
	static long subArraySum(long[] a, int n, long m){
		long max = 0;
		long sum=a[0];
		int j=0;
		for(int i=1; i<n; i++){
			while(sum>m && j<=i-1){
				sum-=a[j];
				j++;
			}
			if(max<=sum) max=sum;
			sum+=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}


/*class HOTELS {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		long m = r.nl();
		long[] a = r.nla(n);
		if(indexOf(a,m)!=-1)w.println(m);
		else
			w.println(subArraySum(a,n,m));
		w.flush();
	}
	
	static long subArraySum(long[] a, int n, long m){
		long max = 0;
		long sum=a[0];
		int j=0;
		for(int i=1; i<n; i++){
			while(sum>m && j<i-1){
				sum-=a[j];
				j++;
			}
			if(max<=sum) max=sum;
			sum+=a[i];
		}
		return max;
	}
	
	static long indexOf(long[] a, long key) {
		int lo = 0;
	    int hi = a.length - 1;
	    while (lo <= hi) {
	        int mid = lo + (hi - lo) / 2;
	        if (key < a[mid]) hi = mid - 1;
	        else if (key > a[mid]) lo = mid + 1;
	        else return mid;
	    }
	    return -1;
	}*/