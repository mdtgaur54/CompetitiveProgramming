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
 * Created by mudit on 28/7/17.
 */
public class FredoandLargeNumbers {
    //Method for sorting the TreeMap based on values
   /* public static <K, V extends Comparable<V>> Map<K, V>
    sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare =
                                map.get(k1).compareTo(map.get(k2));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<K, V> sortedByValues =
                new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }*/
    private static void solve() throws IOException{
        Parser r = new Parser();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        //r.init(System.in);

        int n = r.nextInt();
        long[] a = new long[n];
        Map<Long, Long> map = new HashMap<>();
        for (int i=0; i<n; i++){
            a[i] = r.nextLong();
            if(map.containsKey(a[i])){
                long v = map.get(a[i]);
                v++;
                map.put(a[i],v);
            } else map.put(a[i], 1L);
        }
//        Map sortedMap = sortByValues(map);
       // w.println(map);

        int q = r.nextInt();
        while (q-->0){
            long type = r.nextLong(), f = r.nextLong(), flag = 0;
            if(type==0){
                for(int i=0; i<n; i++){
                    if(map.get(a[i])>=f){
                        w.println(a[i]);
                        flag=1;
                        break;
                    }
                }
                /*for (Map.Entry<Long, Long> entry: map.entrySet()){
                    if(entry.getValue()>=f){
                        w.println(entry.getKey());
                        flag=1;
                        break;
                    }
                }*/

                if(flag==0) w.println(0);


            } else {
                for(int i=0; i<n; i++){
                    if(map.get(a[i])==f){
                        w.println(a[i]);
                        flag=1;
                        break;
                    }
                }

                /*for (Map.Entry<Long, Long> entry: map.entrySet()){
                    if(entry.getValue()>=f){
                        w.println(entry.getKey());
                        flag=1;
                        break;
                    }
                }*/

                if(flag==0) w.println(0);
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
