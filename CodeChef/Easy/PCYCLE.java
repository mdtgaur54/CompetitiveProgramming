package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PCYCLE {
	static StringBuilder sb = new StringBuilder();
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		r.init(System.in);
		int n = r.ni();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++){
			al.add(r.ni());
			al.set(i, al.get(i)-1);
		}
		boolean[] b = new boolean[n];
		int c = 0;
		for(int i = 0; i<n; i++){
			if(!b[i]){
				b[i] = true;
				c++;
				pcycle(al,b,i);
				
			}
		}
		w.print(c+"\n"+sb);
		w.flush();
	}
	
	static void pcycle(ArrayList<Integer> al, boolean[] b, int i){
		sb.append((i+1)+" ");
		int x = i;
		i = al.get(i);
		b[i] = true;
		sb.append((i+1)+" ");
		while(x!=i){
			i = al.get(i);
			sb.append((i+1)+" ");
			b[i]=true;
		}
		sb.append("\n");
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}