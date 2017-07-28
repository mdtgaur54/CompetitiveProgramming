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
import java.util.stream.IntStream;

public class MonkandConversionGame {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni();
            int[] a = r.nia(n);
            int[] b = r.nia(n);
            long sum1 = IntStream.of(a).sum();
            long sum2 = IntStream.of(b).sum();
            if(sum1==sum2) w.println("YES");
            else w.println("NO");
        }

        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
