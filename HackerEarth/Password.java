package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.StringTokenizer;
/**
 * Created by mudit on 12/8/17.
 */
public class Password {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        r.init(System.in);
        int t = r.ni();
        HashSet<String> set=new HashSet();

        while(t-->0){
            StringBuilder sb=new StringBuilder(r.next());
            if(set.contains(sb.reverse().toString())){
                w.println(sb.length()+" "+sb.charAt(sb.length()/2));
                break;
            }
            else{
                set.add(sb.reverse().toString());
            }
            //out.print(a);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
