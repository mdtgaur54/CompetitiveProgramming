package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class PTO7Z {
	private int V;
	private LinkedList<Integer> adj[];
	
	PTO7Z(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i=0; i<V; i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int src, int dest){
		adj[src].add(dest);
		adj[dest].add(src);
	}
	static int x=0, counter=0;
	void BFS(int s){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[s]=true;
		queue.add(s);
		queue.add(-1);
		int height=0;
		while(queue.size()!=0){
			s = queue.poll();
			if(s==-1){
				if(!queue.isEmpty()){
					queue.add(-1);
				}
				height++;
			}
			else{
				x=s;
				Iterator<Integer> i = adj[s].listIterator();
				while(i.hasNext()){
					int n = i.next();
					if(!visited[n]){
						visited[n]=true;
						queue.add(n);
						
					}
				}
			}
		}
		counter=height;
	}
	
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		PTO7Z g = new PTO7Z(n);
		for(int i=1; i<n; i++){
			int u = r.ni(), v = r.ni();
			u--; v--;
			g.addEdge(u,v);
		}
		
	    g.BFS(0);
	    g.BFS(x);
	    w.println(counter-1);
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
	
}