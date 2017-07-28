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
 * Created by mudit on 24/7/17.
 */
public class Monkandtheboxofcookies {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni();
            int[] a = new int[32];
            for(int i=1; i<=n; i++){
                    int x = r.ni();
                    for(int j=0; j<32; j++){
                        if(checkBit(x,j)) a[j]++;
                    }
            }
           // for (int i=0; i<32; i++) w.print(a[i]+" ");
            int max = a[0], ans=0;
            for (int i=1; i<a.length; i++){
                if(a[i]>max){
                    max = a[i];
                    ans = i;
                }

            }
            w.println(ans);
        }
        w.flush();
    }

    static boolean checkBit(int x, int i){
        x = x & (1<<i);
        if(x!=0) return true;
        return false;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
