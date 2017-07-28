package SPOJ.Classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class PT07Y {
	static int root(int[] arr,int i){
		while(arr[i]!=i){
			arr[i]=arr[arr[i]];
			i=arr[i];
		}
		return i;
	}
	
	static void union(int[] tree, int a, int b){
		tree[root(tree,a)]=root(tree,b);
	}
	
	static boolean find(int[] arr,int u, int v){
		if(root(arr,u)==root(arr,v))
			return true;
		return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		StringTokenizer st = new StringTokenizer(s1," ");
		int n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int[] tree = new int[n];
		for(int i=0; i<n; i++)
			tree[i]=i;
		for(int i=0; i<e; i++){
			s1 = br.readLine();
			st = new StringTokenizer(s1," ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			u--;v--;
			if(!find(tree,u,v))
				union(tree,u,v);
			else{ System.out.println("NO"); return; }
		}
		System.out.println("YES");
	}
}

