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
 * Created by mudit on 23/8/17.
 */
public class TheBestPlayer {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), t = r.ni();
        String[] s = new String[n];
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            s[i] = r.next();
            a[i] = r.ni();
        }
        while (t-->0){
            int max = Integer.MIN_VALUE, in=0;
            for (int i=0; i<n; i++){
                if(a[i]>max && a[i]!=0){
                    max=a[i];
                    in=i;
                }
                if(max==a[i] && a[i]!=0){
                    if(s[i].compareTo(s[in])<0){
                        in = i;
                    }
                }
            }
            a[in]=-1;
            w.println(s[in]);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
