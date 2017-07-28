package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class FACEFRND {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n =  r.ni();
		int[] a = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		for(int j=0; j<n; j++){
			a[j] = r.ni();
			int m = r.ni();
			for(int i=0; i<m; i++) set.add(r.ni());	
		}
		for(int i=0; i<a.length; i++){
			if(set.contains(a[i]))
				set.remove(a[i]);
		}
		w.println(set.size());
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}