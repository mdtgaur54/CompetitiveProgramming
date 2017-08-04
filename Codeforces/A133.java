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
 * Created by mudit on 4/8/17.
 */
public class A133 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        String s = r.next();
        if(s.contains("H") || s.contains("Q") || s.contains("9")) w.print("YES");
        else w.print("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
