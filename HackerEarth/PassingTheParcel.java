package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class PassingTheParcel {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int n = r.ni();
		String s = r.next();
		boolean[] a = new boolean[n];
		int j = 0, i = 0;
		while(n!=1){
			j%=s.length();
			i%=a.length;
			if(a[i]==false && s.charAt(j)=='b'){
				a[i] = true;
				n--;
				j++;
			}
			else if(a[i]==false && s.charAt(j)=='a') j++;
			i++;
			
		}
		i=0;
		for(i=0; i<a.length; i++){
			//w.print(a[i]+" ");
			if(a[i]==false) break;
		}
		w.println(i+1);
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}