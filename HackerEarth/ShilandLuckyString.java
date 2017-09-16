package HackerEarth;
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
 * Created by mudit on 15/9/17.
 */
public class ShilandLuckyString {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        String s = r.next();
        char[] a = s.toCharArray();
        char[] a1 = new char[a.length/2];
        char[] a2 = new char[a.length/2];
        int i=0, j=a.length/2;
        for (int k=0; k<a.length/2; k++){
            a1[k] = a[i++];
            a2[k] = a[j++];
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int c1=0, c2=0, c3=0;
        for (int k=0; k<a1.length; k++){
            if(a1[k]>a2[k]) c1++;
            else if(a2[k]>a1[k]) c2++;
            else if(a2[k]==a1[k]) c3++;
        }
        c1 = a.length/2-c1;
        c2 = a.length/2-c2;
        c3 = a.length/2-c3;
        w.println(Math.min(c1, Math.min(c2,c3)));
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}