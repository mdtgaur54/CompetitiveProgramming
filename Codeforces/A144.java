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
 * Created by mudit on 8/8/17.
 */
public class A144 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, p=0, q=0;
        for (int i=0; i<n; i++){
            a[i] = r.ni();
            if (a[i]>max){
                max=a[i];
                p=i;
            }
            if (a[i]<=min){
                min=a[i];
                q=i;
            }
        }
        int ans = 0;
        if(q<p) ans--;
        while (p!=0){
            p--;
            ans++;
        }
        while (q!=n-1){
            q++;
            ans++;
        }
        w.print(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
