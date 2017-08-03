package HackerEarth;
import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Created by mudit on 2/8/17.
 */
public class AkashandtheAssignment {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), q= r.ni();
        String s = r.next();
        char[] a = s.toCharArray();
        while (q-->0){
            int L = r.ni(), R = r.ni(), index = r.ni();
            if(R-L+1<index|| L-R>0 || L<0 || R>a.length) sb.append("Out of range");
            else {
                int[] b = new int[26];
                for (int i = L - 1; i <= R - 1; i++)
                    b[a[i] - 'a']++;
                int sum = 0;
                for (int i = 0; i < 26; i++) {
                    if(b[i]>0) sum += b[i];
                    if (sum >= index) {
                        sb.append((char) (i + 'a')+"\n");
                        break;
                    }
                }
            }

        }
        w.print(sb);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
