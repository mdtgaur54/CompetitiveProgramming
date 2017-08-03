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
 * Created by mudit on 1/8/17.
 */
public class PhineasandFerb {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        long[] a = r.nla(n);
        int q = r.ni();
        while (q-->0){
            int l = r.ni(), R = r.ni();
            l--;
            for (int i=l; i<=R; i++){
                if(a[i]<=0){
                    if(i%2==0) w.println("");
                }
            }
            int x = R-l+1;
            if(x%2==0) w.println("Ferb");
            else w.println("Phineas");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
