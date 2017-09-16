package Codeforces;
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
 * Created by mudit on 24/8/17.
 */
public class A584 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int  n = r.ni(), t = r.ni();
        if(t==10){
            if(n==1) w.println(-1);
            else {
                for (int i=1; i<n; i++){
                    w.print(1);
                }
                w.print(0);
            }
        } else {
            for (int i=1; i<=n; i++) w.print(t);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
