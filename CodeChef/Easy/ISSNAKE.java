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

public class ISSNAKE {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			StringBuilder sb = new StringBuilder();
			int n = r.ni();
			char[][] a = new char[2][n];
			sb.append(r.rl());
			sb.append(r.rl());
			int k = 0, c = 0;
			for(int i=0; i<2; i++){
				for(int j=0; j<n; j++){
					a[i][j] = sb.charAt(k);
					k++;
					if(a[i][j]=='#') c++;
				}
			}
			//w.println(c);
			int i=0, j=0;
			boolean[][] b = new boolean[2][n];
			while(true){
				if(i<2 && j<n-1 && a[i][j]=='#' && a[i][j+1]=='#' && b[i][j]!=true && b[i][j+1]!=true){
					b[i][j]=true;
					//b[i][j+1]=true;
					j++;
					c--;
					
				}
				else if(j<n && i<1 && a[i][j]=='#' && a[i+1][j]=='#' && b[i][j]!=true && b[i+1][j]!=true){
					b[i][j]=true;
					//b[i+1][j]=true;
					i++;
					c--;
				}
				else if(i<2 && j<n && a[i][j]=='#'&& j>0   && a[i][j-1]=='#' && b[i][j]!=true && b[i][j-1]!=true){
					b[i][j]=true;
					//b[i][j-1]=true;
					j--;
					c--;
				}
				else if(i<2 && j<n  && a[i][j]=='#' && i>0 && a[i-1][j]=='#' && b[i][j]!=true && b[i-1][j]!=true){
					b[i][j]=true;
					//b[i-1][j]=true;
					i--;
					c--;
				}
				else{
					c--;
					break;
				}
			}
			if(c==0) w.println("yes");
			else w.println("no");
			//w.println(c);
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}