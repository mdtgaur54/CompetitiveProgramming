package HackerEarth;
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
 * Created by mudit on 24/7/17.
 */
public class HihiandCrazyBits {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            long n = r.nl();
            /*String binary = Long.toBinaryString(n);
            char[] a = binary.toCharArray();
            for(int i=a.length-1; i>=0; i--){
                if(a[i]=='0'){
                    a[i] = '1';
                    break;
                }
            }

            binary = new String(a);
            long ans = Long.parseLong(binary, 2);
            w.println(ans);*/
            long ans = fun(n);
            w.println(ans);


        }
        w.flush();
    }

    static long fun(long n){
        long temp = n;
        for(int i=0; i<65; i++){
            temp = temp|(1<<i);
            if(temp>n) return temp;
        }
        return n;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
