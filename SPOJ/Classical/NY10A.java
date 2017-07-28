package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NY10A {
	public static void main(String[] args) throws IOException{
		Reader in = new Reader();
		in.init(System.in);
		StringBuilder sb = new StringBuilder();
		int t = in.ni();
		while(t-->0){
			int n = in.ni();
			String s = in.next();
			char[] arr = s.toCharArray();
			int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,i;
			for(i=0; i<arr.length-2; i++){
				if(arr[i]=='T' && arr[i+1]=='T' && arr[i+2]=='T') c1++;
				else if(arr[i]=='T' && arr[i+1]=='T' && arr[i+2]=='H') c2++;
				else if(arr[i]=='T' && arr[i+1]=='H' && arr[i+2]=='T') c3++;
				else if(arr[i]=='T' && arr[i+1]=='H' && arr[i+2]=='H') c4++;
				else if(arr[i]=='H' && arr[i+1]=='T' && arr[i+2]=='T') c5++;
				else if(arr[i]=='H' && arr[i+1]=='T' && arr[i+2]=='H') c6++;
				else if(arr[i]=='H' && arr[i+1]=='H' && arr[i+2]=='T') c7++;
				else if(arr[i]=='H' && arr[i+1]=='H' && arr[i+2]=='H') c8++;
			}
			sb.append(n+" "+c1+" "+c2+" "+c3+" "+c4+" "+c5+" "+c6+" "+c7+" "+c8+"\n");
		}
		System.out.print(sb);
	}
}