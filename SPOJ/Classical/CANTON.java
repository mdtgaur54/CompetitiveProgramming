package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class CANTON {
		public static void main(String[] args) throws IOException{
		Reader r = new Reader();
		r.init(System.in);
		StringBuilder sb = new StringBuilder();
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int diag = (int)Math.ceil((Math.sqrt(8*n+1)-1)/2.0);
			int ept = ((diag*diag)+diag)/2;
			int diff = Math.abs(n-ept);
			if(diag%2==0)
				sb.append("TERM "+n+" "+"IS "+(diag-diff)+"/"+(1+diff)+"\n");
			else
				sb.append("TERM "+n+" "+"IS "+(1+diff)+"/"+(diag-diff)+"\n");
		}
		System.out.print(sb);
	}
}