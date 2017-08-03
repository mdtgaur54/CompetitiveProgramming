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
 * Created by mudit on 2/8/17.
 */
public class RoyandSymmetricLogos {
    public void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        //StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni();
            char[][] a = new char[n][n];
            for (int i=0; i<n; i++){
                String s = r.next();
                char[] b = s.toCharArray();
                for (int j=0; j<n; j++){
                    a[i][j] = b[j];
                }
            }
            boolean f = false;
            op:
            for (int i=0; i<=n/2; i++){
                for (int j=0; j<=n/2; j++){
                    if(a[i][j]!=a[i][n-j-1] || a[i][j]!=a[n-i-1][j] || a[i][j]!=a[n-i-1][n-j-1]){
                        f = true;
                        break op;
                    }
                }
            }
            if (f) w.println("NO");
            else w.println("YES");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        new RoyandSymmetricLogos().solve();
    }
}
