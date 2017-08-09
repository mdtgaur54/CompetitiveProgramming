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
 * Created by mudit on 8/8/17.
 */
public class Palindromes {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        String s = r.next();
        char[] a = s.toCharArray();
        boolean f = false;
        int ans = 0;
        for (int i=0; i<=a.length/2; i++){
            if (a[i]!=a[a.length-i-1]){
                ans = s.length();
                f=true;
                break;
            }
        }

        if (!f){
            for (int i=0, j=a.length-1; i<a.length; i++){
                if(a[i]!=a[j]){
                    ans=j-i+1;
                    break;
                }
            }
        }

        w.print(ans);

        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
