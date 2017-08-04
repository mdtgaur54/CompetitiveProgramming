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
public class A58 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        String s = r.next();
        if (isSubSequence(s)) w.print("YES");
        else w.print("NO");
        w.flush();
    }

    private static boolean isSubSequence(String s){
        String sub = "hello";
        int i = s.length()-1, j = sub.length()-1;
        while (i>=0 && j>=0){
            if (s.charAt(i)==sub.charAt(j)){
                i--;
                j--;
            } else i--;
        }
        if(j<0) return true;
        return false;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
