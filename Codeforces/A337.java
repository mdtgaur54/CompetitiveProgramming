package Codeforces;
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
 * Created by mudit on 5/8/17.
 */
public class A337 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni();
        int[] a = r.nia(m);
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i=0; i<=a.length-n; i++){
            min = Math.min(min,(a[i+n-1]-a[i]));
        }
        w.print(min);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
