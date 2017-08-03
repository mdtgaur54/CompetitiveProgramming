package HackerEarth;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * Created by mudit on 31/7/17.
 */
public class DremplayandUpsideDown {
    static char[] a;
    static int [][] b;
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);

        r.init(System.in);
        String s = r.next();
        if(isPalin(s)) w.println(0);
        else {
            StringBuilder sb = new StringBuilder(s);
            String s1 = sb.reverse().toString();
            int c1 = replace(s1);
            int c2 = minInsertion(s1);
            a = s.toCharArray();
            int u = a.length;
            b = new int[u][u];
            for(int i = 0 ; i < u ; i ++) Arrays.fill(b[i],-1);
            int c3 = sol(0, u - 1);
            int x = min(c1,c2);
            int y = min(x,c3);
            w.println(y);
        }
        w.flush();
    }

    private static int sol(int i, int j) {
        if (i >= j)
            return 0;
        if(b[i][j]!=-1)return b[i][j];
        int u = (a[i]==a[j])?0:1;
        return b[i][j] = Math.min(sol(i+1, j-1) + u , Math.min(sol(i+1, j), sol(i, j-1))+1);
    }

    private static boolean isPalin(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())) return true;
        return false;
    }

    private static int replace(String s){
        char[] a = s.toCharArray();
        int c = 0, l=0, h = a.length-1;
        while (l<h){
            if (a[l++]!=a[h--]) c++;
        }
        return c;
    }

    private static int min(int a, int b)
    {   return a < b ? a : b;  }

    private static int minInsertion(String s){
        char[] a = s.toCharArray();
        int[][] table = new int[a.length][a.length];
        int l,h,gap;
        for (gap = 1; gap < a.length; ++gap){
            for (l = 0, h = gap; h < a.length; ++l, ++h){
                table[l][h] = (a[l] == a[h])? table[l+1][h-1] :
                        (min(table[l][h-1], table[l+1][h]) + 1);
            }
        }


        return table[0][a.length-1];
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}
