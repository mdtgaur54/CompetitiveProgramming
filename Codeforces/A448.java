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
 * Created by mudit on 8/9/17.
 */
public class A448 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int a=r.ni(), b=r.ni(), c=r.ni(), x=r.ni(), y=r.ni(), z=r.ni(), n=r.ni();
        int sum1 = a+b+c, sum2 = x+y+z;
        int q1 = sum1/5, q2 = sum2/10, r1 = sum1%5, r2 = sum2%10;
        n-=q1;
        if(r1!=0) n--;
        n-=q2;
        if(r2!=0) n--;
        if(n>=0) w.println("YES");
        else w.println("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
