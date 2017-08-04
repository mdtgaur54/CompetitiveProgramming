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
 * Created by mudit on 4/8/17.
 */
public class MonkandInversions {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni(), ans=0;
            int[][] a = new int[n][n];

            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    a[i][j] = r.ni();
                    for (int i1=0; i1<=i; i1++){
                        for (int j1=0; j1<=j; j1++){
                            if (a[i1][j1]>a[i][j]) ans++;
                        }
                    }
                }
            }
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
