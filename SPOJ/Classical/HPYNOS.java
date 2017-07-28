package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class HPYNOS {
	static private long count(long n){
		long c = 0;
		long n1 = n;
		long a,sum,sum2;
		boolean[] arr = new boolean[1000];
		while(true){
			n=breaking(n);
			c++;
			if(n==1)
				return c;
			if(arr[(int)n]) {
				c=-1;
				return c;
			}
			arr[(int)n]=true;
		}
	}
	
	static long breaking(long n){
		long sum=0,a;
		while(n!=0){
			a=n%10;
			sum+=a*a;
			n/=10;	
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		Reader in = new Reader();
		in.init(System.in);
		StringBuilder sb = new StringBuilder();
		long n = in.nl();
		System.out.println(count(n));
	}
}