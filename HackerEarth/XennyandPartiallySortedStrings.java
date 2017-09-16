package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Created by mudit on 21/8/17.
 */
public class XennyandPartiallySortedStrings {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni(), k=r.ni(), m=r.ni();
            String[] s1 = new String[n];
            String[] s2 = new String[n];
            for (int i=0; i<n; i++){
                s1[i] = r.next();
                s2[i] = s1[i].substring(0,m);
            }
            Arrays.sort(s2);
            for (int i=0; i<n; i++){
                if(s2[k-1].compareTo(s1[i].substring(0,m))==0){
                    w.println(s1[i]);
                    break;
                }
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
