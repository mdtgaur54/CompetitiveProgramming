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
 * Created by mudit on 27/7/17.
 */
public class MarkTheAnswer {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), x = r.ni(), c=0, ans=0;
        long[] a = r.nla(n);
        for(int i=0; i<n; i++){
            if(c<1 && a[i]>x){
                c++;
            }
            else if(a[i]>x) break;
            else ans++;
        }
        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
