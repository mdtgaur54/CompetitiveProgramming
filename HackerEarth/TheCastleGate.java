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
 * Created by mudit on 24/7/17.
 */
public class TheCastleGate {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);

        int t = r.ni();
        while(t-->0){
            int n = r.ni(), ans=0;
            for(int i=1; i<=n; i++){
                for(int j=i+1; j<=n; j++){
                    if((i^j)<=n) ans++;
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
