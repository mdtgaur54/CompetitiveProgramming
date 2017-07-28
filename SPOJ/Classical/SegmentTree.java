package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class SegmentTree {
	private static void solve() throws IOException{
		Parser r = new Parser();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		//r.init(System.in);
		int n = r.nextInt();
		int[] a = new int[n+1];
		for(int i=1; i<a.length; i++)
			a[i] = r.nextInt();
		int N = 4*n;
		int[] A = new int[N];
		construct(a, n, A);
		int m = r.nextInt();
		while(m-->0){
			int x = r.nextInt(), y = r.nextInt();
			int ans = query(x, y, n, A);
			w.println(ans);
		}
		
		/*for(int i=0; i<A.length; i++){
			w.print(A[i]+" ");
		}
		w.println();
		for(int i=0; i<a.length; i++)
			w.print(a[i]+" ");*/
		w.flush();
	}
	
	static void construct(int[] a, int n, int[] A){
		build_rec(1,1,n,a,A);
	}
	
	static void update(int pos, int val, int n,  int[] A){
		update_rec(1,1,n,pos,val,A);
	}
	
	static int query(int begin, int end, int n, int[] A){
		return query_rec(1,1,n,begin,end,A);
	}
	
	static void build_rec(int node, int begin, int end, int[] a, int[] A){
		if(begin==end)
			A[node] = a[begin];
		else{
			int mid = (int)Math.floor((begin+end)/2);
			build_rec(2*node, begin, mid, a, A);
			build_rec(2*node+1, mid+1, end, a, A);
			A[node] = Math.max(A[2*node], A[2*node+1]);
		}
	}
	
	static void update_rec(int node, int begin, int end, int pos, int val, int[] A){
		if(begin==end)
			A[node] = val;
		else{
			int mid = (int)Math.floor((begin+end)/2);
			if(pos<=mid)
				update_rec(2*node, begin, mid, pos, val, A);
			else
				update_rec(2*node+1, mid+1, end, pos, val, A);
			A[node] = Math.max(A[2*node], A[2*node+1]);
		}
	}
	
	static int query_rec(int node, int t_begin, int t_end, int a_begin, int a_end, int[] A){
		if(t_begin>=a_begin && t_end<=a_end)
			return A[node];
		else{
			int mid = (int) Math.floor((t_begin+t_end)/2);
			int res = -1;
			if(mid>=a_begin && t_begin<=a_end)
				res = Math.max(res, query_rec(2*node, t_begin, mid, a_begin, a_end, A));
			if(t_end>=a_begin && (mid+1)<=a_end)
				res = Math.max(res, query_rec(2*node+1, mid+1, t_end, a_begin, a_end, A));
			return res;
		}
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}