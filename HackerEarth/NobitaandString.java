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
 * Created by mudit on 12/8/17.
 */
public class NobitaandString {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s = r.rl();
            String[] ar = s.split(" ");
            for (int i=ar.length-1; i>=0; i--) w.print(ar[i]+" ");
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}