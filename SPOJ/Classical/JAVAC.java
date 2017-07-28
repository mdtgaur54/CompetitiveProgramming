package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class JAVAC {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			String s = r.next();
			if(s.contains("_")){
				if(s.contains("A-Z")) w.println("Error!");
				else{
					String[] arr = s.split("_");
					for(int i=1; i<arr.length; i++){
						arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
					}
					for(int i=0; i<arr.length; i++) w.print(arr[i]);
					w.println();
				}	
			}
		}
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}