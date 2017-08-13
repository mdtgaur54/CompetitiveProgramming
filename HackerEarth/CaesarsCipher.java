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
public class CaesarsCipher {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s1 = r.next(), s2 = r.next();
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            int ans = (a2[0]-a1[0])%26;
            if(ans<0) ans+=26;
            if(a1.length>1) {
                for (int i = 1; i < a1.length; i++) {
                    int f = (a2[i] - a1[i]) % 26;
                    if (f<0) {
                        f+=26;
                        if(ans!=f) {
                            ans = -1;
                            break;
                        }
                    } else {
                        if(ans!=f){
                            ans=-1;
                            break;
                        }
                    }
                }
            }
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
