package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SBANK {
	private static void solve() throws IOException{
		BufferedReader q=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter w = new PrintWriter(System.out,true);
		int t = Integer.parseInt(q.readLine());
		while(t-->0){
			ArrayList<String> al = new ArrayList<String>();
			Map<String, Integer> map =  new HashMap<String, Integer>();
			int n = Integer.parseInt(q.readLine());
			String s = ""; int c=0;
			for(int i=0; i<n; i++){
				s=q.readLine();
				if(map.containsKey(s)){
					c=map.get(s);
					c++;
					map.put(s,c);
				}
				else{
					al.add(s);
					map.put(s,1);
				}
			}
			Collections.sort(al);
			for(int i=0; i<al.size(); i++){
				w.println(al.get(i)+" "+map.get(al.get(i)));
			}
			q.readLine();
			w.println();
		}
		w.flush();
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}
