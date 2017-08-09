package HackerEarth;
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
 * Created by mudit on 9/8/17.
 */
public class SumitAndRohil {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        String[] s = new String[n];
        for (int i=0; i<n; i++){
            s[i] = r.next();
        }
        boolean[] b = new boolean[n];
        int ans = 0;
        for (int i=0; i<n; i++){
            if(!b[i]) {
                b[i] = true;
                ans++;
                for (int j = i + 1; j < n; j++) {
                    String s1 = s[i], s2 = s[j];
                    if(!b[j]) {
                        if (checkAnagram(s1, s2)) {
                            if (s1.charAt(0) == s2.charAt(0) && s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)) {
                                b[j] = true;
                            }
                        }
                    }
                }
            }
        }
        w.println(ans);
        w.flush();
    }

    private static boolean checkAnagram(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1,a2)) return true;
        return false;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
