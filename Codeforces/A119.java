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
 * Created by mudit on 12/8/17.
 */
public class A119 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int a = r.ni(), b = r.ni(), n = r.ni();
        int x = Integer.MIN_VALUE;
        while (n!=0){
            x = GCD(a,n);
            n-=x;
            if (n<0){
                w.println(1);
                break;
            } else if(n==0){
                w.println(0);
                break;
            }
            x = GCD(b,n);
            n-=x;
            if (n<0){
                w.println(0);
                break;
            } else if (n==0){
                w.println(1);
                break;
            }
        }
        w.flush();
    }

    private static int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
