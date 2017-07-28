package SPOJ.Classical;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

class BITMAP {
	private static void solve() throws Exception{
	    Parser in = new Parser();
		//PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		int t = in.nextInt();
		while(t-->0){
			
			int m = in.nextInt(), n = in.nextInt();
			int[][] result = new int[m][n];
			boolean[][] visited = new boolean[m][n];
			Queue<Cord> queue = new LinkedList<Cord>();
			for(int i=0; i<m; i++){
				String input = in.readLine();
				for(int j=0; j<n; j++){
					//result[i][j]=Integer.MAX_VALUE;
					if(input.charAt(j)=='1'){ 
						visited[i][j]=true;  
						queue.add(new Cord(i,j,0));
						result[i][j]=0;
					}
					else result[i][j]=Integer.MAX_VALUE;
				}
			}
			Cord temp = null;
			int x = 0, y = 0, dist = 0;
			while(!queue.isEmpty()){
				temp = queue.poll();
				x = temp.x;
				y = temp.y;
				dist = temp.distance;
				if(x>0 && result[x-1][y]>dist && !visited[x-1][y]){
					queue.add(new Cord(x-1,y,dist+1));
					result[x-1][y]=dist+1;
				}
				if(y>0 && result[x][y-1]>dist && !visited[x][y-1]){
					queue.add(new Cord(x,y-1,dist+1));
					result[x][y-1]=dist+1;
				}
				if(x<m-1 && result[x+1][y]>dist && !visited[x+1][y]){
					queue.add(new Cord(x+1,y,dist+1));
					result[x+1][y]=dist+1;
				}
				if(y<n-1 && result[x][y+1]>dist && !visited[x][y+1]){
					queue.add(new Cord(x,y+1,dist+1));
					result[x][y+1]=dist+1;
				}
			}
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					sb.append(result[i][j]+" ");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		//w.flush();
		System.out.print(sb);
	}
	
	public static void main(String[] args) throws Exception{
		solve();
	}
	
	static class Cord{
		public int x;
		public int y;
		public int distance;
		
		public Cord(int x, int y, int distance){
			this.x=x;
			this.y=y;
			this.distance=distance;
		}
	}

}