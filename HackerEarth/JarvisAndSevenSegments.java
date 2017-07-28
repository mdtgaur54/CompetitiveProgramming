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
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class JarvisAndSevenSegments {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int[] a = r.nia(n);
			Map<Integer, Integer> map = new HashMap<>();
			map.put(0, 6);
			map.put(1, 2);
			map.put(2, 5);
			map.put(3, 5);
			map.put(4, 4);
			map.put(5, 5);
			map.put(6, 6);
			map.put(7, 3);
			map.put(8, 7);
			map.put(9, 6);
			
			int min = Integer.MAX_VALUE, ans = 0;
			
			for(int i=0; i<n; i++){
				int x = findMinSum(map, a[i]);
				if(min > x){
					min = x;
					ans = a[i];
				}
			}
			
			w.println(ans);
		}
		w.flush();
	}
	
	private static int findMinSum(Map<Integer, Integer> map, int n){
		int sum = 0;
		if(n==0) return 6;
		
		while(n!=0){
			int key = n%10;
			sum += map.get(key);
			n /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}