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
 * Created by mudit on 24/8/17.
 */
public class A581 {
    private static void solve() throws IOException{
        Reader in = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        in.init(System.in);
        int r = in.ni(), w = in.ni();
        int ans1=0, ans2=0;
        if(r>w){
           ans1 = w;
           ans2 = (r-w)/2;
        } else if(w>r) {
            ans1 = r;
            ans2 = (w-r)/2;
        } else {
            ans1 = r;
        }
        out.println(ans1+" "+ans2);
        out.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
