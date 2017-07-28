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
import java.util.Arrays;
import java.util.StringTokenizer;

public class RoyAndCountingSortedSubstrings {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni();
            String s = r.next();
            char[] a = s.toCharArray();
            long ans=0, len=1;
            for(int i=1; i<a.length; i++){
                if(a[i]>=a[i-1]){
                    len++;
                } else {
                    ans+=sum(len);
                    len=1;
                }
            }
            ans+=sum(len);
            w.println(ans);
        }
        w.flush();
    }

    static long sum(long n){
        return (n*(n+1))/2;
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
