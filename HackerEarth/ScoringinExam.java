package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by mudit on 16/9/17.
 */
public class ScoringinExam {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), q = r.ni();
        int[] a = r.nia(n);
        int[] b = r.nia(n);
        Arrays.sort(a);
        b[0]=a[n-1];
        int j=1;
        for (int i=n-2; i>=0; i--){
            b[j] = a[i]+b[j-1];
            j++;
        }
        while (q-->0){
            int k = r.ni();
            w.println(b[k-1]);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}