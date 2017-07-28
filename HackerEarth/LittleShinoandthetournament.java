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
import java.util.StringTokenizer;

public class LittleShinoandthetournament {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), q = r.ni();
        int[] a = r.nia(n);
        int[] fights = new int[n];
        boolean[] b = new boolean[n];
        boolean bool = true;
        while (bool){
            bool = false;
            for (int i=0; i<n; ){
                while (i<n && b[i]) i++;
                if(i==n) break;
                int j=i+1;
                while (j<n && b[j]) j++;
                if (j==n) break;
                bool=true;
                fights[i]++;
                fights[j]++;
                if(a[i]>a[j]) b[j] = true;
                else b[i] = true;
                i=j+1;
            }

        }

        //w.println(al);

        while (q-->0){
            int x = r.ni();
            w.println(fights[x-1]);
        }

        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
