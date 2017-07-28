package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Arrays;
public class PERMUT2 {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			int n = Reader.ni();
			if(n==0)
				break;
			int[] arr = new int[n];
			int[] arr2 = new int[n];
			for(int i=0; i<n; i++)
				arr[i]=Reader.ni();
			for(int i=0; i<n; i++){
					arr2[arr[i]-1]=i+1;
			}		
			if(Arrays.equals(arr, arr2))
				sb.append("ambiguous\n");
			else
				sb.append("not ambiguous\n");
		}
		System.out.print(sb);
	}
}