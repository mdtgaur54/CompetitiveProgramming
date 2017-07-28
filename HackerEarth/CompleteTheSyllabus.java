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

public class CompleteTheSyllabus {
	private static void solve() throws IOException{
		Parser r = new Parser();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		//r.init(System.in);
		
		int t = r.nextInt();
		while(t-->0){
			long k = r.nextLong();
			long[] a = new long[7];
			long sum = 0;
			for(int i=0; i<7; i++){
				a[i] = r.nextLong();
				sum+=a[i];
			}
			k%=sum;
			int i = 0;
			if(k==0){
				for(i=6; i>=0; i--){
					if(a[i]!=0) break;
				}
			}
			
			while(k>0){
				k-=a[i];
				if(k<=0) break;
				i++;
				i%=7;
			}
			
			switch(i){
				case 0:
					w.println("MONDAY");
					break;
				case 1:
					w.println("TUESDAY");
					break;
				case 2:
					w.println("WEDNESDAY");
					break;
				case 3:
					w.println("THURSDAY");
					break;
				case 4:
					w.println("FRIDAY");
					break;
				case 5:
					w.println("SATURDAY");
					break;
				case 6:
					w.println("SUNDAY");
					break;
				default:
					break;
			}
			
		}
		
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}