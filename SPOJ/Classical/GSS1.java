package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.StringTokenizer;

public class GSS1 {
	
	private static int[] a, sum;
	private static Parser r;
	private static PrintWriter w;
	private static int n;
	private static void solve() throws IOException{
		r = new Parser();
		w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		n =  r.nextInt();
		a = new int[n+1];
		//sum = new int[n+1];
		for(int i=1; i<=n; i++){
			a[i] = r.nextInt();
			//sum[i] = a[i] + sum[i-1];
		}	
		/*for(int i=0; i<=n; i++)
			w.print(sum[i]+" ");*/
		
		//SegmentTree st = new SegmentTree(1,n);
		build(a,1,1,n+1);
		int m = r.nextInt();
		while(m-->0){
			int x = r.nextInt(), y = r.nextInt();
			w.println(query(1,1,n+1,x,y));
		}
		
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
	
	static class Data {
		public int sum=0, pref=0, suff=0, ans=0;
		
		Data(int sum, int pref, int suff, int ans){
			this.sum=sum;
			this.pref=pref;
			this.suff=suff;
			this.ans=ans;
		}
	}
	
	static Data[] t = new Data[4*n];
	
	static Data combine(Data l, Data r){
		Data res= new Data(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
		res.sum = l.sum + r.sum;
		res.pref = Math.max (l.pref, l.sum + r.pref);
		res.suff = Math.max (r.suff, r.sum + l.suff);
		res.ans = Math.max (Math.max (l.ans, r.ans), l.suff + r.pref);
		return res;
	}
	
	static Data make_data (int val) {
		Data res= new Data(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
		res.sum = val;
		res.pref = res.suff = res.ans = Math.max (0, val);
		return res;
	}
	
	static void build (int a[], int v, int tl, int tr) {
		if (tl == tr)
			t[v] = make_data (a[tl]);
		else {
			int tm = (int)Math.floor((tl + tr) / 2);
			build (a, v*2, tl, tm);
			build (a, v*2+1, tm+1, tr);
			t[v] = combine (t[v*2], t[v*2+1]);
		}
	}
	
	void update (int v, int tl, int tr, int pos, int new_val) {
		if (tl == tr)
			t[v] = make_data (new_val);
		else {
			int tm = (tl + tr) / 2;
			if (pos <= tm)
				update (v*2, tl, tm, pos, new_val);
			else
				update (v*2+1, tm+1, tr, pos, new_val);
			t[v] = combine (t[v*2], t[v*2+1]);
		}
	}
	
	static Data query (int v, int tl, int tr, int l, int r) {
		if (l == tl && tr == r)
			return t[v];
		int tm = (int)Math.floor((tl + tr) / 2);
		if (r <= tm)
			return query (v*2, tl, tm, l, r);
		if (l > tm)
			return query (v*2+1, tm+1, tr, l, r);
		return combine (
			query (v*2, tl, tm, l, tm),
			query (v*2+1, tm+1, tr, tm+1, r)
		);
	}
	
}