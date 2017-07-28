package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p1 {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		for(int i=1; i<=t; i++){
			long n = r.nl();
			while(n>-1){
				if(areSorted(n)){
					w.println("Case #"+i+": "+n);
					break;
				}
				n--;
			}
			
		}
		
		w.flush();
	}
	
	static boolean areSorted(long n)
	{
	    long next_digit = n%10;
	    n = n/10;
	    while (n!=0)
	    {
	        long digit = n%10;
	        if ((digit > next_digit || digit==0) && next_digit!=0)
	            return false;
	        next_digit = digit;
	        n = n/10;
	    }
	 
	    return true;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}