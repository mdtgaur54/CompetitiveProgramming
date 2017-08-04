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
 * Created by mudit on 4/8/17.
 */
public class A263 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int i=1,j=1;
        op:
        for (i=1; i<=5; i++){
            for (j=1; j<=5; j++){
                if(r.ni()==1) break op;
            }
        }
        w.print(Math.abs(3-i)+Math.abs(3-j));
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
