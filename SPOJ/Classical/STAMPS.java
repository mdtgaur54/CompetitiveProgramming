package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class STAMPS {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		long t = Reader.nl();
		StringBuilder sb = new StringBuilder();
		int j=1;
		while(t-->0){
			long n = Reader.nl();
			long p = Reader.nl();
			long[] arr = new long[(int)p];
			for(int i=0; i<p; i++)
				arr[i]=Reader.nl();
			Arrays.sort(arr);
			long sum=0,count=0;
			int i=0;
			for(i=arr.length-1; i>=0; i--){
				sum+=arr[i];
				count++;
				if(sum>=n)
					break;	
			}
			sb.append("Scenario #"+j+++":"+"\n");
			if(sum>=n){
				sb.append(count+"\n\n");
			}
			else if(sum<n){
				sb.append("impossible\n\n");
			}
		}
		System.out.print(sb);
	}
}