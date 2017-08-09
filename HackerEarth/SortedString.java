package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by mudit on 8/8/17.
 */
public class SortedString {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s = r.next();
            char[] a = s.toCharArray();
            int[] len = new int[26];
            boolean[] b = new boolean[26];
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<a.length; i++){
                len[a[i]-'a']++;
            }

            while (sb.length()!=s.length()){
                int min = Integer.MAX_VALUE;
                int index = -1;
                for (int i=0; i<26; i++){
                    if(min>len[i] && !b[i] && len[i]!=0){
                        min=len[i];
                        index=i;
                    }
                }
                b[index] = true;
                for (int j=1; j<=min; j++){
                    sb.append((char)(index+'a'));
                }
            }
            w.println(sb);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
