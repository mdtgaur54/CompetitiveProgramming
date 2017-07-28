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
public class MemoriseMe {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        int[] b = new int[100001];
        for (int i=1; i<=n; i++){
            b[r.ni()]++;
        }
        int q = r.ni();
        while (q-->0){
            int x = r.ni();
            if(b[x]==0) w.println("NOT PRESENT");
            else w.println(b[x]);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
