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
public class A271 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        while (++n <= 9011){
            if (Integer.toString(n).chars().distinct().count()==4) break;
        }
        w.print(n);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
