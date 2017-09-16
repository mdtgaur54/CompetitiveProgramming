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
 * Created by mudit on 25/8/17.
 */
public class MonkandNiceStrings {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        String[] s = new String[n];
        for (int i=0; i<n; i++) s[i] = r.next();
        int[] a = new int[n];
        for (int i=1; i<n; i++){
            int sum = 0;
            for (int j=i; j>=0; j--){
                if(s[i].compareTo(s[j])>0) sum++;
            }
            a[i] = sum;
        }
        for (int i=0; i<n; i++) w.println(a[i]);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
