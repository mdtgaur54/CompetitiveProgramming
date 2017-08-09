package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Created by mudit on 8/8/17.
 */
public class TheStrongestString1 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        String s = r.next();
        char[] a = s.toCharArray();
        boolean[] b = new boolean[26];
        int start = 0, end = a.length;
        while (start<end){
            int index = -1;
            char max = 'A';

            for (int i=start; i<end; i++){
                if (!b[a[i]-'a'] && a[i]>max){
                    max=a[i];
                    index=i;
                }
            }
            if(index==-1) break;
            w.print(max);
            start = index;
            b[max-'a'] = true;
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}