package Codeforces;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/**
 * Created by mudit on 14/9/17.
 */
public class A519 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        Map<Character, Integer> bl = new HashMap<>();
        Map<Character, Integer> wh = new HashMap<>();
        bl.put('q', 9);
        bl.put('r', 5);
        bl.put('b', 3);
        bl.put('n', 3);
        bl.put('p', 1);
        bl.put('k', 0);
        bl.put('.', 0);

        wh.put('Q', 9);
        wh.put('R', 5);
        wh.put('B', 3);
        wh.put('N', 3);
        wh.put('P', 1);
        wh.put('K', 0);
        wh.put('k', 0);

        int sum1=0, sum2=0;
        for (int i=0; i<8; i++){
            String s = r.rl();
            char[] a = s.toCharArray();
            for (int j=0; j<8; j++){
                if (a[j] >= 65 && a[j] <= 90)
                    sum1 += wh.get(a[j]);
                else sum2 += bl.get(a[j]);
            }

        }
        if(sum1>sum2) w.print("White");
        else if(sum2>sum1) w.print("Black");
        else w.print("Draw");

        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
