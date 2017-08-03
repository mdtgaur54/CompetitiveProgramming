package HackerEarth;
import com.sun.org.apache.regexp.internal.RE;

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
 * Created by mudit on 2/8/17.
 */
public class AkashandtheAssignment {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), q= r.ni();
        String s = r.next();
        while (q-->0){
            int L = r.ni(), R = r.ni(), index = r.ni();
            String sub = s.substring(L-1,R);
            char[] a = sub.toCharArray();
            Arrays.sort(a);
            char ch = a[0];
            ArrayList<Character> al = new ArrayList<>();
            al.add(ch);
            for (int i=1; i<a.length; i++){
                if(a[i]!=ch){
                    ch = a[i];
                    al.add(ch);
                }
            }
            index--;
            if(index<al.size())
            w.println(al.get(index));
            else w.println("Out of range");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
