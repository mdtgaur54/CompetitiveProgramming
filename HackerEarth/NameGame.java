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
 * Created by mudit on 21/8/17.
 */
public class NameGame {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni();
            String s = r.next();
            String ans = "";
            int[] a = {67,71,73,79,83,89,97,101,103,107,109,113};
            char[] ch = s.toCharArray();
            for (int i=0; i<n; i++){
                int min = Integer.MAX_VALUE;
                int index=0;
                for (int j=0; j<a.length; j++){
                    if(min>Math.abs(a[j]-ch[i])){
                        min = Math.abs(a[j]-ch[i]);
                        index=j;
                    }
                }
                if(min==0) ans+=ch[i];
                else ans+=(char)a[index];
            }
            w.println(ans);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
