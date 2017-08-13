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
 * Created by mudit on 12/8/17.
 */
public class A500 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), k = r.ni();
        int[] a = new int[n];
        for (int i=1; i<=n-1; i++) a[i] = r.ni();
        int i=1;
        while (i<k){
            i = a[i]+i;
        }
        if (i==k) w.println("YES");
        else w.println("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
