package HackerEarth;
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
 * Created by mudit on 23/8/17.
 */
public class SavePatients {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] a = r.nia(n);
        int[] b = r.nia(n);
        Arrays.sort(a);
        Arrays.sort(b);
        boolean f = false;
        for (int i=0; i<n; i++){
            if(a[i]<=b[i]){
                f=true;
                break;
            }
        }
        if (f) w.println("No");
        else w.println("YES");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
