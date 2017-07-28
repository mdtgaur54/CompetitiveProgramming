package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class GIRLSNBS {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			int n = Reader.ni();
			int m = Reader.ni();
			if(n==-1 && m==-1) break;
			if(n==0 && m==0) sb.append(0+"\n");
			else if(n==m && n!=0 && m!=0) sb.append(1+"\n");
			else if(n==0) sb.append(m+"\n");
			else if(m==0) sb.append(n+"\n");
			else{
				if(n>m){
					int x = (int)Math.ceil((n+m)/(m+1));
					sb.append(x+"\n");
				}
				else{
					int x = (int)Math.ceil((n+m)/(n+1));
					sb.append(x+"\n");
				}
			}
		}
		System.out.print(sb);
	}
}