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
 * Created by mudit on 26/7/17.
 */
public class MotuandPatlu {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni(), c1=0, c2=0;
            long[] a = r.nla(n);
            int i=0, j = n-1, n1=n, sum=0, sum2=0;
            boolean[] b = new boolean[n];
            b[0] = true; b[n-1] = true;
            while(i<=j){
                if(i==j && !b[i] && !b[j]) c1++;
                if(sum+a[i]<2*a[j]+sum2){
                    sum+=a[i];
                    b[i] = true;
                    i++; c1++;

                } else if(sum+a[i]==2*a[j]+sum2){
                    sum=0; sum2=0;
                    b[i]=true; b[j] = true;
                    i++; j--; c1++; c2++;

                } else {
                    sum2+=a[j];
                    b[j] = true;
                    j--; c2++;

                }
            }
            if(c1>c2) w.println(c1+" "+c2+" "+"\n"+"Motu");
            else if(c2>c1) w.println(c1+" "+c2+" "+"\n"+"Patlu");
            else w.println(c1+" "+c2+" "+"\n"+"Tie");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
