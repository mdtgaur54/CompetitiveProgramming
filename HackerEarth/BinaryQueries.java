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
 * Created by mudit on 26/7/17.
 */
public class BinaryQueries {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), q = r.ni();
        int[] a = r.nia(n);
        while (q-->0){
            if(r.ni()==0){
                int L = r.ni(), R = r.ni();
                R--;
                if(a[R]==1) w.println("ODD");
                else w.println("EVEN");
            } else {
                int z = r.ni();
                z--;
                if(a[z]==0) a[z] = 1;
                else a[z] = 0;
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
