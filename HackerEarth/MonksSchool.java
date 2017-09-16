package HackerEarth;
import com.sun.javafx.scene.control.skin.VirtualFlow;

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
 * Created by mudit on 15/9/17.
 */
class Students {
    public String name;
    public int age;
    public Students(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class MonksSchool {
    static class AgeComparator implements Comparator<Students>{

        @Override
        public int compare(Students o1, Students o2) {
            return o1.age-o2.age;
        }
    }
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni();
        String[] ar = new String[n];
        for (int i=0; i<n; i++) ar[i] = r.next();
        Map<String, List<Students>> map = new TreeMap<>();
        for (int i=0; i<m; i++){
            String[] s = r.rl().split(" ");
            if(map.containsKey(s[0])){
                List<Students> al = new ArrayList<>();
                al.addAll(map.get(s[0]));
                al.add(new Students(s[1],Integer.parseInt(s[2])));
                map.put(s[0],al);
            } else {
                List<Students> al = new ArrayList<>();
                al.add(new Students(s[1],Integer.parseInt(s[2])));
                map.put(s[0],al);
            }
        }
        for(Map.Entry<String, List<Students>> e : map.entrySet()){
            w.println(e.getKey());
            List<Students> al = new ArrayList<>();
            al.addAll(e.getValue());
            Collections.sort(al, new AgeComparator());
            for(Students e1 : al)
                w.println(e1.name+" "+e1.age);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}