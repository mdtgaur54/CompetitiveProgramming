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
import java.util.stream.IntStream;

/**
 * Created by mudit on 25/8/17.
 */
public class Oldkeypadinaforeignland {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = r.nia(n);
        int k = r.ni();
        int[] ka = r.nia(k);
        int sum1 = IntStream.of(ka).sum();
        int sum2 = IntStream.of(a).sum();
        if(sum1<n) w.println(-1);
        else if(k>=n) w.println(sum2);
        else {
            Arrays.sort(a);
            Arrays.sort(ka);
            int ans=0;
            int na = 1;
            int i = n-1;
            while (na<=n){
                for (int j=0; j<k; j++){
                    if(i>=0 && ka[j]!=0){
                        ans+=a[i--]*na;
                        ka[j]--;
                    }
                }
                na++;
            }
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
