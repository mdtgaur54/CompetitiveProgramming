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

class Barriers {
    private long x;
    private long y;
    private long d;

    Barriers(long x, long y, long d){
        this.x = x;
        this.y = y;
        this.d = d;
    }

    public long getX() {return x;}
    public long getY() {return y;}
    public long getD() {return d;}

}


public class MissingSoldiers {
    public  ArrayList<Barriers> al;
    class BarrierComparator implements Comparator<Barriers>{

        @Override
        public int compare(Barriers o1, Barriers o2) {
            if(o1.getX()>o2.getX()) return 1;
            else if (o1.getX()<o2.getX()) return -1;
            else return 0;
        }
    }
    private void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);

        int n = r.ni();
        al= new ArrayList<>();
        while (n-->0){
            al.add(new Barriers(r.nl(), r.nl(), r.nl()));
        }

        Collections.sort(al, new BarrierComparator());

        long max = Long.MIN_VALUE, ans=0;
        for (int i=0; i<al.size(); i++){
           max = Math.max(max, al.get(i).getX());
           long end = al.get(i).getD() + al.get(i).getX();
           if(end>=max) {
               ans += end - max + 1;
               max = end + 1;
           }
        }

        w.println(ans);
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        new MissingSoldiers().solve();
    }
}