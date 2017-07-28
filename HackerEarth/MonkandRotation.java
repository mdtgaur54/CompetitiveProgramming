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
/**
 * Created by mudit on 28/7/17.
 */
public class MonkandRotation {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni(), k = r.ni();
            int[] a = r.nia(n);

            if(k%n==0){
                for (int i=0; i<n; i++) w.print(a[i]+" ");
            } else {
                k = k%n;
                k = n-k;
                for(int i=k; i<n; i++){
                    w.print(a[i]+" ");
                }
                for (int i=0; i<k; i++) w.print(a[i]+" ");
            }
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
