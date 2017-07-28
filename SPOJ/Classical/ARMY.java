package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ARMY {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			br.readLine();
			String[] s1 = br.readLine().split(" ");
			int n = Integer.parseInt(s1[0]);
			int m = Integer.parseInt(s1[1]);
			int max1=0;
			String[] s2 = br.readLine().split(" ");
			for(int i=0; i<s2.length; i++){
				 int max=Integer.parseInt(s2[i]);
				if(max>max1)
					max1=max;
			}
			int max2=0;
			String[] s3 = br.readLine().split(" ");
			for(int i=0; i<s3.length; i++){
				int max = Integer.parseInt(s3[i]); 
				if(max>max2)
					max2=max;
			}
			if(max1>=max2){
				sb.append("Godzilla\n");
			}
			else{
				sb.append("MechaGodzilla\n");
			}
		}
		System.out.println(sb);
	}
}
