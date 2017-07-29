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
/**
 * Created by mudit on 29/7/17.
 */
public class ThePrimeCells {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[][] a = new int[n+2][n+2];
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                a[i][j] = r.ni();
            }
        }
        int ans = 0, sum=0;
        for (int i=1; i<=n; i++ ){
            for (int j=1; j<=n; j++){
                sum = a[i][j-1]+a[i][j+1]+a[i-1][j]+a[i+1][j];
                if (sieve(sum)) ans++;
            }
        }

        w.print(ans);
        w.flush();
    }

    public static boolean sieve(int n)
    {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        int m=(int)Math.sqrt(n);

        for (int i=2; i<=m; i++)
            if (prime[i])
                for (int k=i*i; k<=n; k+=i)
                    prime[k]=false;

        return prime[n];
    }


    public static void main(String[] args) throws IOException{
        solve();
    }
}
