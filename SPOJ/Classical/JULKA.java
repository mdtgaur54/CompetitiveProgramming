package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JULKA {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		for(int i=1; i<=10; i++){
			BigInteger a = r.nb();
			BigInteger b = r.nb();
			ArrayList<BigInteger>  result = julka(a, b);
			w.println(result.get(1));
			w.println(result.get(0));
			w.flush();
		}
	}
	private static ArrayList<BigInteger> julka(BigInteger a, BigInteger b){
		ArrayList<BigInteger> result = new ArrayList<BigInteger>();
		BigInteger sum = a.add(b);
		BigInteger x = new BigInteger("2");
		BigInteger Nat = sum.divide(x);
		BigInteger Kla = a.subtract(Nat);
		result.add(Kla);
		result.add(Nat);
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}