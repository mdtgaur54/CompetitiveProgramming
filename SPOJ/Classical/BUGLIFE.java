package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Graph{
	private int V;
	private LinkedList<Integer> adj[];
	
	Graph(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i=0; i<V; i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int src, int dest){
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	boolean isBipertite(Graph g, int s, int v, int[] color, boolean[] visited){
		color[s] = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s]=true;
		while(!queue.isEmpty()){
			int x = queue.poll();
			Iterator<Integer> i= adj[x].listIterator();
			while(i.hasNext()){
				int z = i.next();
				if(color[z]==-1){
					color[z] = 1-color[x];
					queue.add(z);
					visited[z]=true;
				}
				else if(color[z]==color[x] && visited[z]) {
					return false;
				}
			}
		}
		return true;
	}
}

public class BUGLIFE {
	private static void solve() throws Exception{
		Parser r = new Parser();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		//r.init(System.in);
		int t = r.nextInt();
		for(int i=1; i<=t; i++){
			int n = r.nextInt(), m = r.nextInt();
			Graph g = new Graph(n);
			while(m-->0){
				int u = r.nextInt(), v = r.nextInt();
				u--; v--;
				g.addEdge(u, v);
			}
			int[] color = new int[n];
			boolean[] visited = new boolean[n];
			Arrays.fill(color, -1);
			boolean ans = true;
			for(int in=0; in<n; in++){
				if(color[in]==-1 && !visited[in]){
					if(!g.isBipertite(g, in, n, color, visited)){
						ans=false;
						break;
					}
				}
			}
			/*for(int j=0; j<n; j++){
				w.print(color[j]+' ');
			}*/
			if(ans) w.println("Scenario #"+i+":\nNo suspicious bugs found!");
			else w.println("Scenario #"+i+":\nSuspicious bugs found!");
			
		}
		w.flush();
	}
	
	public static void main(String[] args) throws Exception{
		solve();
	}
}