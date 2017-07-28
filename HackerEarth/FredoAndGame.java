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

public class FredoAndGame {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		
		int t = r.ni();
		while(t-->0){
			int ammo = r.ni(), n = r.ni(), i = 0;
			int[] a = r.nia(n);

			while(ammo>0 && i<a.length){
				if(a[i]==0) ammo--;
				else ammo+=2;
				i++;
			}
			
			if(i==a.length) w.println("Yes" + " " + ammo);
			else w.println("No" + " " + i);
		}
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}