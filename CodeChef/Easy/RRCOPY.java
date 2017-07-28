package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class RRCOPY {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int[] a = r.nia(n);
			Set<Integer> set = new HashSet<>();
			for(int i=0; i<a.length; i++){
				set.add(a[i]);
			}
			w.println(set.size());
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}