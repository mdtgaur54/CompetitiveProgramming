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
 * Created by mudit on 28/7/17.
 */
public class NiceArches {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni(), ans=0;
        while(t-->0){
            String s = r.next();
            char[] a = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<a.length; i++){
                stack.push(a[i]);
                if(stack.size()!=1 && stack.peek()==stack.elementAt(stack.size()-2)){
                    stack.pop();
                    stack.pop();
                }
            }
            if(stack.isEmpty()) ans++;
        }
        w.print(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
