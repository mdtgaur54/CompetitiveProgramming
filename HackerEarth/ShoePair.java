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

public class ShoePair {
    private static void solve() throws IOException{
        Parser r = new Parser();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
       // r.init(System.in);
        long a=r.nextLong(), s=r.nextLong(), k=r.nextLong(), x=r.nextLong(), y=r.nextLong(), ans=0;
        ans = (s+k*y-a)/(x+y);
        if((ans*x)+a==s+((k-ans)*y))
            w.print(ans);
        else
            w.print(-1);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
