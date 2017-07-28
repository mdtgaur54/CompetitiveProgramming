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
 * Created by mudit on 27/7/17.
 */
public class ModifySequence {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        long sum = 0;
        for(int i=0; i<n; i++){
            int x=r.ni()*(int)Math.pow(10,i);
            sum+=x;
        }
        if(sum%11==0) w.println("YES");
        else w.println("NO");
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
