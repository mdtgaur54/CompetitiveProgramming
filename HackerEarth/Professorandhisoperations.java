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
 * Created by mudit on 29/7/17.
 */
public class Professorandhisoperations {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = r.nia(n);
        int[] c = new int[n];
        int q = r.ni();
        while (q-->0){
            int L = r.ni(), R = r.ni();
            L--; R--;
            for (int i=L; i<=R; i++) c[i]++;
        }

        for (int i=0; i<n; i++){
            if(c[i]%2==0){
                int temp = a[i];
                a[i] = a[n-i-1];
                a[n-i-1] = temp;
            }
        }
        for (int i=0; i<n; i++) w.print(a[i]+" ");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
