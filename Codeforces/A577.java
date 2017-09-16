package Codeforces;
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
 * Created by mudit on 8/9/17.
 */
public class A577 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), x = r.ni(), sq = (int)Math.sqrt(x), c=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=1; i<=sq; i++){
            if(x%i==0) al.add(i);
        }
        for (int i=0; i<al.size(); i++){
            int a = al.get(i), b = x/a;
            if(a<=n && b<=n && a!=b) c+=2;
            else if(a<=n && b<=n) c++;
        }
        w.println(c);
        w.flush();
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
