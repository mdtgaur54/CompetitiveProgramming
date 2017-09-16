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
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
/**
 * Created by mudit on 15/9/17.
 */
class Pair{
    public int s, e;
    Pair(int s, int e){
        this.s=s;
        this.e=e;
    }

}
public class MonkandModuloBasedSorting {
    static class PairsComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.e-o2.e;
        }
    }
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), k = r.ni();
        ArrayList<Pair> al = new ArrayList<>();
        for (int i=0; i<n; i++){
            int x = r.ni();
            int y = x%k;
            al.add(new Pair(x,y));
        }
        Collections.sort(al, new PairsComparator());
        for (Pair p : al){
            w.print(p.s+" ");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}