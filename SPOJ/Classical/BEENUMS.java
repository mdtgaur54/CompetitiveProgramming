package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class BEENUMS {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			long n = Reader.nl();
			if(n==-1)
				break;
			if(n==1)
				sb.append("Y\n");
			else if(bee(n)) sb.append("Y\n");
			else sb.append("N\n");
		}
		System.out.print(sb);
	}
	static boolean bee(long n){
		long a =1;
		for(int i=1; i<n; i++){
			a+=6*i;
			if(a==n) return true;
			if(a>n) return false;
		}
		return false;
	}
}