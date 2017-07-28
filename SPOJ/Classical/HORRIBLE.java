package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HORRIBLE {
	private static long tree[] = new long[450002];
	private static long lazy[] = new long[450002];
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni(), c = r.ni();
			while(c-->0){
				int x = r.ni();
				if(x==0){
					updateRange(1,1,n,r.ni(),r.ni(),r.nl());
				}
				else if(x==1){
					w.println(queryRange(1, 1, n, r.ni(), r.ni()));
				}
			}
			Arrays.fill(tree, 0);
			Arrays.fill(lazy, 0);
		}
		w.flush();
	}
	
	static void updateRange(int node, int start, int end, int l, int r, long val)
	{
	    if(lazy[node] != 0)
	    { 
	        // This node needs to be updated
	        tree[node] += (end - start + 1) * lazy[node];    // Update it
	        if(start != end)
	        {
	        	lazy[2*node]+=lazy[node];
				lazy[2*node+1]+=lazy[node];               // Mark child as lazy
	        }
	        lazy[node] = 0;                                  // Reset it
	    }
	    if(start > end || start > r || end < l)              // Current segment is not within range [l, r]
	        return;
	    if(start >= l && end <= r)
	    {
	        // Segment is fully within range
	        tree[node] += (end - start + 1) * val;
	        if(start != end)
	        {
	            // Not leaf node
	            lazy[node*2] += val;
	            lazy[node*2+1] += val;
	        }
	        return;
	    }
	    int mid = (start + end) / 2;
	    updateRange(node*2, start, mid, l, r, val);        // Updating left child
	    updateRange(node*2 + 1, mid + 1, end, l, r, val);   // Updating right child
	    tree[node] = tree[node*2] + tree[node*2+1];        // Updating root with max value 
	}

	static long queryRange(int node, int start, int end, int l, int r)
	{
	    if(start > end || start > r || end < l)
	        return 0;         // Out of range
	    if(lazy[node] != 0)
	    {
	        // This node needs to be updated
	        tree[node] += (end - start + 1) * lazy[node];            // Update it
	        if(start != end)
	        {
	        	lazy[2*node]+=lazy[node];
				lazy[2*node+1]+=lazy[node];      // Mark child as lazy
	        }
	        lazy[node] = 0;                 // Reset it
	    }
	    if(start >= l && end <= r)             // Current segment is totally within range [l, r]
	        return tree[node];
	    int mid = (start + end) / 2;
	    long p1 = queryRange(node*2, start, mid, l, r);         // Query left child
	    long p2 = queryRange(node*2 + 1, mid + 1, end, l, r); // Query right child
	    return (p1 + p2);
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}