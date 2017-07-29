package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Created by mudit on 29/7/17.
 */
public class FredoandSums {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni();
            int[] a = r.nia(n);
            Arrays.sort(a);
            long minSum=0, maxSum=0;
            for (int i=n-1; i>0; i-=2){
                minSum+=Math.abs(a[i]-a[i-1]);
            }
            for (int i=n-1, j=0; j<n/2; i--, j++){
                maxSum+=Math.abs(a[i]-a[j]);
            }
            w.println(minSum+" "+maxSum);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
