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
 * Created by mudit on 28/7/17.
 */
public class IDemandTrialbyCombat {
    private static void solve() throws IOException{
        Parser r = new Parser();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        //r.init(System.in);
        int t = r.nextInt();
        while (t-->0){
            int n = r.nextInt(), m = r.nextInt();
            int[] a = new int[n];
            for (int i=0; i<n; i++) a[i] = r.nextInt();
            int[] b = new int[n];
            int[] c = new int[n];
            Arrays.fill(c,1);
            int[] d = new int[n];
            Arrays.fill(d,0);
            for(int i=0; i<m; i++){
                if(Arrays.equals(a,c) || Arrays.equals(a,d)) break;
                for(int j=0; j<n; j++){
                    if(j==0){
                        if(a[j+1]==1) b[j]=1;
                        else continue;
                    }
                    else if(j==n-1){
                        if (a[j-1]==1) b[j]=1;
                        else continue;
                    }
                    else if(a[j-1]==1 && a[j+1]==1) b[j]=1;
                }
                a = b.clone();
                Arrays.fill(b,0);
            }
            for (int i=0; i<n; i++) w.print(a[i]+" ");
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
