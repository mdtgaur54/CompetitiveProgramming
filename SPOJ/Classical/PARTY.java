package SPOJ.Classical;
import java.io.IOException;
import java.io.PrintWriter;

public class PARTY {
	private static PrintWriter w;
	private static void solve() throws IOException{
		Reader r = new Reader();
		w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		while(true){
			int W = r.ni(), N = r.ni();
			if(W==0 && N==0) break;
			int[] wi = new int[N];
			int[] va = new int[N];
			for(int i=0; i<N; i++){
				wi[i] = r.ni();
				va[i] = r.ni();
			}
			knapsack(wi, va, W, N);
		}
		w.flush();
	}
	
	static void knapsack(int[] wi, int[] va, int W, int N){
		int[][] k = new int[N+1][W+1];
		int[][] c = new int[N+1][W+1];
		for(int i=0; i<=N; i++)
			k[i][0]=0;
		for(int i=0; i<=W; i++)
			k[0][i]=0;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=W; j++){
				if(wi[i-1]<=j){
					k[i][j] = Math.max((va[i-1]+k[i-1][j-wi[i-1]]), k[i-1][j]);;
				}
				else 
					k[i][j] = k[i-1][j];
			}
		}
		int sum=0;
		for(int i=0; i<=W; i++){
			if(k[N][i]==k[N][W]){
				sum+=i;
				break;
			}
		}
		
		w.println(sum+" "+k[N][W]);
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}