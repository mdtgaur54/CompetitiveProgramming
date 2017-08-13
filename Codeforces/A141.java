package Codeforces;
import com.sun.deploy.util.ArrayUtil;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.StringTokenizer;
/**
 * Created by mudit on 12/8/17.
 */
public class A141 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        String s1 = r.next(), s2 = r.next(), s3 = r.next();
        int[] ar1 = new int[26];
        int[] ar2 = new  int[26];
        sb.append(s1); sb.append(s2);
        String s4 = sb.toString();
        char[] a = s4.toCharArray();
        for (int i=0; i<a.length; i++){
            ar1[a[i]-'A']++;
        }
        a = s3.toCharArray();
        for (int i=0; i<a.length; i++){
            ar2[a[i]-'A']++;
        }
        boolean f = true;
        for (int i=0; i<26; i++){
            if (ar1[i]!=ar2[i]) f=false;
        }
        if (f) w.println("YES");
        else w.println("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
