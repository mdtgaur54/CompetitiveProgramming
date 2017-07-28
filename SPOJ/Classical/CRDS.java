package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class CRDS {
	public static void main(String[] args) throws IOException{
		Reader r = new Reader();
		r.init(System.in);
		int t = r.ni();
		StringBuilder sb = new StringBuilder();
		while(t-->0){
			long n = r.nl();
			long result = countCards(n);
			sb.append(result);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static long countCards(long n){
		long count = 3*((n*(n+1))/2)-n;
		count%=1000007;
		return count;
	}
}