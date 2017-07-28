package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class INVCNT {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		int t = Reader.ni();
		StringBuilder sb = new StringBuilder();
		while(t-->0){
			int n = Reader.ni();
			long[] arr = new long[n];
			long[] arr2 = new long[n];
			long[] bit = new long[n];
			for(int i=0; i<n; i++){
				arr[i]=Reader.nl();
			}	
			for(int i=0; i<n; i++){
				arr2[i]=arr[i];
			}
			Arrays.sort(arr2);
			for(int i=0; i<n; i++){
				int x = Arrays.binarySearch(arr2,arr[i]);
				arr[i]=x+1;
			}
			long invcnt = 0;
			for(int i=n-1; i>=0; i--){
				invcnt+=getSum(arr[i]-1,bit);
				update(arr[i],arr,bit,1);
			}
			sb.append(invcnt+"\n");
		}
		System.out.println(sb);
	}
	
	static void update(long index, long a[], long bit[], int k){
		int n=a.length;
		while(index<a.length){
			bit[(int)index]+=k;
			index=index + (index & -index);
		}
	}
	
	static long getSum(long l, long[] bit){
		long sum=0;
		while(l>0){
			sum+=bit[(int)l];
			l=l - (l & -l);
		}
		return sum;
	}
}