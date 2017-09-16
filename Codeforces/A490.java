package Codeforces;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/**
 * Created by mudit on 26/8/17.
 */
public class A490 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        ArrayList<Integer> al = new ArrayList<>();
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i=0; i<n; i++) al.add(r.ni());
        c1 = Collections.frequency(al, 1);
        c2 = Collections.frequency(al, 2);
        c3 = Collections.frequency(al, 3);
        int min = Math.min(c1, Math.min(c2,c3));
        if(min==0) w.println(0);
        else {
            w.println(min);
            while (min-->0){
                String s = "";
                String s2 = "";
                for (int i=0; i<n; i++){
                    if(al.get(i)!=0 && !s.contains(String.valueOf(al.get(i)))){
                        s+=String.valueOf(al.get(i));
                        s2+=(i+1)+" ";
                        al.set(i,0);
                    }
                }
                w.println(s2);
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
