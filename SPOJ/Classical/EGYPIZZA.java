package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EGYPIZZA {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		int ans=0,c1=0,c2=0,c3=0;
		while(n-->0){
			String s = r.next();
			if(s.charAt(0)=='3') c1++;
			else if(s.charAt(2)=='2') c2++;
			else if(s.charAt(2)=='4') c3++;
		}
		ans=c1;
		c3-=c1;
		ans = ans+c2/2;
		if(c2%2==1){ ans++; c3-=2; }
		if(c3>0){
			ans = ans + c3/4; 
			if(c3%4>0) ans++;
		}
		w.println(ans+1);
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}