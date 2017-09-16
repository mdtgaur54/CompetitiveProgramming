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
 * Created by mudit on 16/9/17.
 */
public class GameOfStrengths {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni();
            long[] a = r.nla(n);
            Arrays.sort(a);
            long x = n-1, sum=0;
            for (int i=n-1; i>=0; i--){
                sum+=a[i]*x;
                x-=2;
            }
            int m = 1000000007;
            sum%=m;
            long max = a[n-1]%m;
            long ans = (sum*max)%m;
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}