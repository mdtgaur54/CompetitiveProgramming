package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class VOTERS {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n1 = r.ni(), n2 = r.ni(), n3 = r.ni();
		int sum = n1+n2+n3;
		Map<Integer, Integer> map = new HashMap<>();
		while(sum-->0){
			int x = r.ni();
			if(map.containsKey(x)){
				int t = map.get(x);
				map.put(x, t+1);
			}
			else{
				map.put(x, 1);
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		int c = 0;
		for(Entry<Integer, Integer> temp : map.entrySet()){
			Integer key = temp.getKey();
			Integer val = temp.getValue();
			if(val>=2){
				al.add(key);
				c++;
			}
		}
		Collections.sort(al);
		w.println(c);
		for(int temp : al) w.println(temp);
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}