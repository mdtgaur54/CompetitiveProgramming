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
 * Created by mudit on 3/8/17.
 */
public class MonkandOperations {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni();
        long[][] a1 = r.nl2(n,m);
        int v1 = r.ni(), v2 = r.ni(), v3 = r.ni(), v4 = r.ni();
        long ans1 = 0, ans2 = 0;
        for (int i=0; i<n; i++){
            long sum1=0, sum2=0, sum3=0;
            for (int j=0; j<m; j++){
                sum3+=Math.abs(a1[i][j]);
                sum1+=Math.abs(a1[i][j]+v1);
                sum2+=Math.abs(v2);
            }

            sum1 = Math.max(sum1,Math.abs(sum3));
            ans1+=Math.max(sum1,sum2);
        }
        for (int i=0; i<m; i++){
            long sum1=0, sum2=0, sum3=0;
            for (int j=0; j<n; j++){
                sum3+=Math.abs(a1[j][i]);
                sum1+=Math.abs(a1[j][i]+v3);
                sum2+=Math.abs(v4);
            }
            sum1 = Math.max(sum1,Math.abs(sum3));
            ans2+=Math.max(sum1,sum2);
        }

        w.print(Math.max(ans1,ans2));
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
