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
 * Created by mudit on 27/7/17.
 */
public class LongATMQueue {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = r.nia(n);
        int ans = 1;

        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]) ans++;
        }
        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
