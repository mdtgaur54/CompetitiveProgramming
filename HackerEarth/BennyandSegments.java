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
import java.util.zip.CheckedOutputStream;

/**
 * Created by mudit on 25/8/17.
 */
class Pairs{
    public int s, e;
    Pairs(int s, int e){
        this.s=s;
        this.e=e;
    }

}
public class BennyandSegments {
    class PairsComparator implements Comparator<Pairs> {
        @Override
        public int compare(Pairs o1, Pairs o2) {
            return o1.s-o2.s;
        }
    }
    private void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            int n = r.ni(), l = r.ni();
            ArrayList<Pairs> al = new ArrayList<>();
            for (int i=0; i<n; i++){
                int xl = r.ni(), xr =  r.ni();
                al.add(new Pairs(xl, xr));
            }
            Collections.sort(al, new PairsComparator());
            boolean b = false;
            op:
            for (int i=0; i<n; i++){
                int maxRight = al.get(i).s+l;
                int right = al.get(i).e;
                for (int j=0; j<n; j++){
                    if(al.get(j).s>al.get(i).e && al.get(j).e<=maxRight)
                        if(al.get(j).s<=right)
                            right = Math.max(right,al.get(j).e);
                }
                if(right-al.get(i).s==l){
                    b=true;
                    break op;
                }
            }
            if(b) w.println("Yes");
            else w.println("No");
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        new BennyandSegments().solve();
    }
}
