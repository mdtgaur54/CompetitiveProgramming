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
 * Created by mudit on 5/8/17.
 */
public class A580 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = r.nia(n);
        int j = 1, len = 1;
        for (int i=1; i<n; i++){
            if(a[i]>=a[i-1]){
                j++;
                if (j>len) len=j;
            } else j=1;

        }
        w.print(len);
        //Optional but less efficient solution
        /*int n = r.ni();
        int[] a = r.nia(n);
        int j = 0, len = 1;
        for (int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                len = Math.max(len, i-j+1);
                j=i+1;
            } else if (i+1==n-1){
                len = Math.max(len, i-j+2);
            }
        }
        w.print(len);*/
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}

