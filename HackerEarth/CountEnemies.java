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
public class CountEnemies {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s = r.next();
            int ans = 0;
            String[] a = s.split("\\*");
            for (int i=0; i<a.length; i++){
                if(!a[i].contains("X")) ans+=a[i].length();
            }

            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
