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
 * Created by mudit on 1/8/17.
 */
public class SylvestersSequence {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        int m = 1000000007;
        while (t-->0){
            int n = r.ni();
            long[] ar = new long[n+1];
            long  mul = 6;
            ar[1] = 2; ar[2]=3;
            if(n==1) w.print(ar[1]);
            else if(n==2) w.print(ar[1]+" "+ar[2]);
            else{
                for (int i=3; i<=n; i++){
                    long ans = ((mul%m)+1)%m;
                    ar[i] = ans%m;
                    mul = ((mul%m)*(ans%m))%m;
                }
                for (int i=1; i<=n; i++) w.print(ar[i]+" ");
            }
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
