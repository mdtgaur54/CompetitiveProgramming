package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * Created by mudit on 27/7/17.
 */
public class MonkandPowerofTime {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<n; i++) queue.add(r.ni());
        int[] a = r.nia(n);
        int i=0, ans=0;
        while (queue.size()!=0){
            int s = queue.poll();
            if(a[i]==s){
                i++;
                ans++;
            } else {
                queue.add(s);
                ans++;
            }
        }
        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
