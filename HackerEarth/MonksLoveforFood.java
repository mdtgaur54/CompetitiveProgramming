package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;
/**
 * Created by mudit on 27/7/17.
 */
public class MonksLoveforFood {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int q = r.ni();
        Stack<Integer> stack = new Stack<>();
        while (q-->0){
            int x = r.ni();
            if(x==1){
                if(stack.size()==0) w.println("No Food");
                else w.println(stack.pop());
            } else stack.push(r.ni());
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
