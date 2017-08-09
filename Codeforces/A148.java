package Codeforces;
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
 * Created by mudit on 5/8/17.
 */
public class A148 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int k = r.ni(), l = r.ni(), m = r.ni(), n = r.ni(), d = r.ni();
        if(k==1 || l==1 || m==1 || n==1) w.print(d);
        else if(k>d || l>d || m>d || n>d) w.print(0);
        else {
            int c = 0;
            for (int i=1; i<=d; i++){
                if (i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0) c++;
            }
            w.print(d-c);
        }
        w.flush();
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
