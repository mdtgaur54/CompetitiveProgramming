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
public class A122 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        if(n%4==0 || n%7==0 || n%44==0 || n%77==0 || n%47==0 || n%74==0
                || n%444==0 || n%447==0 || n%477==0 || n%474==0 || n%747==0
                || n%777==0 || n%744==0 || n%774==0) w.print("YES");
        else w.print("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
