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
 * Created by mudit on 9/8/17.
 */
public class MarutandStrings {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        if (t==0) w.println("Invalid Test");
        else {
            while (t-- > 0) {
                String s = r.next();
                char[] a = s.toCharArray();
                int sum1 = 0, sum2 = 0;
                for (int i = 0; i < a.length; i++) {
                    if (a[i] > 64 && a[i] < 91) sum1++;
                    else if (a[i] > 96 && a[i] < 123) sum2++;
                }

                if (sum1 == 0 && sum2 == 0) w.println("Invalid Input");
                else w.println(Math.min(sum1, sum2));
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
