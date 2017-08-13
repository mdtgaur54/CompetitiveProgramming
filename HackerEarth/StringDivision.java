package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by mudit on 12/8/17.
 */
public class StringDivision {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s = r.next();
            ArrayList<Character> al = new ArrayList<>();
            for (int i=0; i<s.length(); i++) al.add(s.charAt(i));
            Set<Character> set = new HashSet<>(al);
            if (s.length()<4) w.println("NO");
            else if(set.size()==1){
                if (s.length()>=10) w.println("YES");
                else w.println("NO");
            }
            else if (set.size()==2){
                if (s.length()>=7) w.println("YES");
                else if(s.length()==6){
                    int prod=1;
                    for (char c: set){
                        prod*=Collections.frequency(al, c);
                    }
                    if (prod>5) w.println("YES");
                    else w.println("NO");
                } else w.println("NO");
            }
            else if(set.size()==3){
                if(s.length()>=5) w.println("YES");
                else w.println("NO");
            } else w.println("YES");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
