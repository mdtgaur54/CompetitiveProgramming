package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.io.PrintWriter;
public class FENCE1 {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			int n = Reader.ni();
			if(n==0) break;
			float r = n/(float)Math.PI;
			float ans = ((float)Math.PI*(r*r))/2.0f;
			out.printf("%.2f\n",ans);	
			out.flush();
		}
	}
}