package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ThePsychicType {
	private static void solve() throws IOException{
		Parser r = new Parser();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		//r.init(System.in);
		
		int n = r.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) a[i] = r.nextInt();
		int s = r.nextInt(), e = r.nextInt();
		boolean[] visited = new boolean[n];
		s--;
		while(!visited[s]){
			visited[s] = true;
			s = a[s]-1;
		}
		
		if(visited[e-1]) w.print("Yes");
		else w.print("No");
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}