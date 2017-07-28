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
 * Created by mudit on 24/7/17.
 */
public class SubhamandBinaryStrings {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni(), c = 0;
            String s = r.next();
            char[] a = s.toCharArray();
            for (int i=0; i<n; i++){
                if(a[i]=='0') c++;
            }
            w.println(c);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
