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
public class SubmatrixUpdates {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni(), k = r.ni();
        int[][] a = r.ni2(n,m);
        while (k-->0){
            int R = r.ni(), C = r.ni(), S = r.ni(), D = r.ni();
            for (int i=R-1; i<(R+S-1); i++){
                for (int j=C-1; j<(C+S-1); j++){
                    a[i][j]+=D;
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++) w.print(a[i][j]+" ");
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
