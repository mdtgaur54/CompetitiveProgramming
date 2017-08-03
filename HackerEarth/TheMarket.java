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
 * Created by mudit on 1/8/17.
 */
public class TheMarket {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++){
            a[i] = danger(r.ni());
        }
        int q = r.ni();
        while (q-->0){
            int L = r.ni(), R = r.ni();
            int ans = 0;
            for (int i=L; i<R; i++){
                for (int j=L+1; j<=R; j++){
                    if(i!=j&&a[i]==a[j]){
                       // w.println(a[i]+" "+a[j]+" "+i+" "+j);
                        ans++;
                    }
                }
            }
            w.println(ans);
        }
        w.flush();
    }

    private static int danger(int n){
        int val = 0;
        for (int i=1; i<=n; i++){
            if(n%i==0) val++;
        }
        return val;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
