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
public class ProandConList {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni(); long sum=0;
            long[] a = new long[n];
            long max=Long.MIN_VALUE, second=Long.MIN_VALUE;
            for (int i=0; i<n; i++){
                long x = r.nl(), y=r.nl();
                a[i]=x+y;
                if(a[i]>max){
                    second=max;
                    max=a[i];
                } else if(a[i]>second && a[i]<max) second=a[i];
                sum+=y;
            }
            long ans = max+second-sum;
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
