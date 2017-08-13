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
 * Created by mudit on 11/8/17.
 */
public class A344 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int ans=1;
        int a = r.ni();
        for (int i=1; i<n; i++){
            int x = r.ni();
            if(x!=a){
                a=x;
                ans++;
            }
        }
        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
