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
public class A546 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int k = r.ni(), n = r.ni(), W = r.ni();
        int sum = (W*(W+1))/2;
        int ans = k*sum - n;
        if (ans>0)
            w.print(ans);
        else w.print(0);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
