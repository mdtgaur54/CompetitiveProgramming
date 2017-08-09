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
 * Created by mudit on 8/8/17.
 */
public class A451 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni();
        n = Math.min(m,n);
        if(n%2==0) w.print("Malvika");
        else w.print("Akshat");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
