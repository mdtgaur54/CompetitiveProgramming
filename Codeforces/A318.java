package Codeforces;
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
 * Created by mudit on 9/8/17.
 */
public class A318 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        long n = r.nl(), k = r.nl(), ans=0;
        if(n%2==0){
            if(k<=n/2){
                ans = 2*k-1;
            } else {
                ans = 2*(k-n/2);
            }
        } else {
            if (k<=n/2+1){
                ans = 2*k-1;
            } else {
                ans = 2*(k-(n/2+1));
            }
        }
        w.print(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
