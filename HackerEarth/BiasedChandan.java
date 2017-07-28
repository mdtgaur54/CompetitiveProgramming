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
import java.util.Stack;
import java.util.StringTokenizer;
/**
 * Created by mudit on 27/7/17.
 */
public class BiasedChandan {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i=0; i<n; i++){
            int x = r.ni();
            if(x==0){
                int z = stack.pop();
                ans-=z;
            }
            else {
                ans+=x;
                stack.push(x);
            }
        }

        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
