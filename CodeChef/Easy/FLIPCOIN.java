package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class FLIPCOIN {
	private static int[] st;
	private static int[] lazy;
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni(), q = r.ni();
		st = new int[4*n+2]; lazy = new int[4*n+2];
		while(q-->0){
			int x = r.ni();
			if(x==0){
				int a = r.ni(), b = r.ni();
				a++; b++;
				update(1,1,n,a,b);
			}
			else{
				int a = r.ni(), b = r.ni();
				a++; b++;
				int c = query(1,1,n,a,b);
				w.println(c);
			}
		}
		w.flush();
	}
	
	private static void update(int node, int start, int end, int l, int r){
		if(lazy[node]==1){
			st[node] = (end-start+1) - st[node];
			if(start!=end){
				lazy[node<<1] = 1-lazy[node<<1];
				lazy[(node<<1)+1] = 1-lazy[(node<<1)+1];
			}
			lazy[node]=0;
		}
		if(l>end || r<start) return;
		if(start>=l && end<=r){
			st[node] = (end-start+1) - st[node];
			if(start!=end){
				lazy[node<<1] = 1-lazy[node<<1];
				lazy[(node<<1)+1] = 1-lazy[(node<<1)+1];
			}
			return;
		}
		update(node<<1,start,(end+start)>>1,l,r);
		update((node<<1)+1,((end+start)>>1)+1,end,l,r);
		st[node] = st[node<<1] + st[(node<<1)+1];
	}
	
	private static int query(int node, int start, int end, int l, int r){
		if(l>end || r<start) return 0;
		if(lazy[node]==1){
			st[node] = (end-start+1) - st[node];
			if(start!=end){
				lazy[node<<1] = 1-lazy[node<<1];
				lazy[(node<<1)+1] = 1-lazy[(node<<1)+1];
			}
			lazy[node]=0;
		}
		if(start>=l && end<=r) return st[node];
		int x = query(node<<1, start, (end+start)>>1, l, r);
		int y = query((node<<1)+1, ((end+start)>>1)+1, end, l, r);
		return x+y;
		
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}