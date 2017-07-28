package SPOJ.Classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Arrays;

public class OFFSIDE {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			int n = Reader.ni();
			int m = Reader.ni();
			if(n==0 && m==0)
				break;
			int[] A = new int[n];
			int[] D = new int[m];
			for(int i=0; i<n; i++)
				A[i]=Reader.ni();
			for(int i=0; i<m; i++)
				D[i]=Reader.ni();
			int min = A[0];
			for(int i=1; i<n; i++){
				if(A[i]<min) min=A[i];
			}
			int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
			for(int i=0; i<m; i++){
				if(D[i]<first){
					second=first;
					first=D[i];
				}
				else if(D[i]<second)
					second=D[i];
			}
			if(min<second) sb.append("Y\n");
			else sb.append("N\n");
		}
		System.out.print(sb);
	}
}