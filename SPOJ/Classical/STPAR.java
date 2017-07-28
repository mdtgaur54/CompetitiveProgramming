package SPOJ.Classical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Stack;

public class STPAR {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		while(true){
			int n = Reader.ni();
			if(n==0) break;
			int[] arr = new int[n];
			for(int i=0; i<n; i++) arr[i]=Reader.ni();
			Stack st = new Stack();
			int[] arr2 = new int[n];
			int k=0;
			for(int i=0; i<n-1; i++){
				if(arr[i]>arr[i+1]){ 
					st.push(arr[i]);
					if(arr[i+1]==arr[n-1] && (int)st.peek()<arr[i+1]){
						arr2[k++]=(int)st.pop();
						//k++;
						arr2[k++]=arr[i+1];
					}
					else if(arr[i+1]==arr[n-1] && (int)st.peek()>arr[i+1]){
						arr2[k++]=arr[i+1];
						//k++;
						arr2[k++]=(int)st.pop();
					}
				}
				else{
					if(st.isEmpty()){
						arr2[k++]=arr[i];
						//k++;
					}
					else if(!st.isEmpty()){
						if(arr[i]<(int)st.peek()){ 
							arr2[k++]=arr[i]; 
						}
						
						while(!st.empty() && (int)st.peek()>arr[i] && (int)st.peek()<arr[i+1]){
							arr2[k++]=(int)st.pop();
						}
						if(!st.isEmpty() && arr[i+1]==arr[n-1] && (int)st.peek()<arr[i+1]){
							arr2[k++]=(int)st.pop();
							arr2[k++]=arr[i+1];
						}
						else if(!st.isEmpty()&&arr[i+1]==arr[n-1] && (int)st.peek()>arr[i+1]){
							arr2[k++]=arr[i+1];
							arr2[k++]=(int)st.pop();
						}
					}
					if(st.isEmpty() && arr2[n-1]==0 && arr[i+1]==arr[n-1])
						arr2[n-1]=arr[n-1];
				}
			}

			while(!st.isEmpty()){
				arr2[k++]=(int)st.pop();
			}
			Arrays.sort(arr);
			if(Arrays.equals(arr,arr2)) sb.append("yes\n");
			else sb.append("no\n");
		}
		System.out.print(sb);
	}
}