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
 * Created by mudit on 21/7/17.
 */
class AABBAAC {
    private static void solve() throws IOException {
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        r.init(System.in);

        int t = r.ni();
        while (t-->0) {
            int n = r.ni(), m = r.ni();
            String[] S = new String[n];
            long[] L = new long[n];

            for (int i=0; i<n; i++)
                S[i] = r.next();
            L[0] = S[0].length();
            for (int i=1; i<n; i++){
                L[i] = 2*L[i-1] + S[i].length();
            }
            while (m-->0){
                long x = r.nl();
                for (int i=n-1; i>=0; i--){
                    if(i==0){
                        w.print(S[i].charAt((int)x));
                        break;
                    }
                    if(x<L[i-1]) continue;
                    else if(x<2*L[i-1]){
                        x = 2*L[i-1]-x-1;
                        continue;
                    }
                    if(x>=2*L[i-1]){
                        x = (int)(x-2*L[i-1]);
                        w.print(S[i].charAt((int)x)); break;
                    }
                }
            }
            w.println();

        }

        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
