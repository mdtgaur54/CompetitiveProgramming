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
public class A59 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        String s =  r.next();
        char[] a = s.toCharArray();
        int c1=0, c2=0;
        for (int i=0; i<a.length; i++){
            if(a[i]>=97 && a[i]<=122) c1++;
            else c2++;
        }
        if (c2>c1) w.println(s.toUpperCase());
        else w.println(s.toLowerCase());
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
