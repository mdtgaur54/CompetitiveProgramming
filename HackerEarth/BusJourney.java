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

public class BusJourney {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni(), m = r.ni(), arriving=0, leaving=0, ans=0, sitting=0;
		for(int i=1; i<n; i++){
			arriving+=r.ni();
			leaving+=r.ni();
			sitting = arriving-leaving;
			if(sitting>=m) ans++;
		}
		w.print(ans);
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}