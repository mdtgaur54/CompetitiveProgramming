package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LEPERMUT {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			int n = r.ni();
			int[] a = r.nia(n);
			int inv1=0, inv2=0;
			for(int i=0; i<n-1; i++){
				if(a[i]>a[i+1]) inv1++;
			}
			inv2 = inversionCount(a);
			if(inv1==inv2) w.println("YES");
			else w.println("NO");
		}
		w.flush();
	}
	
	static int inversionCount(int[] arr){
		int[] arr2 = new int[arr.length];
		int[] bit = new int[arr.length];	
		for(int i=0; i<arr.length; i++){
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2);
		for(int i=0; i<arr.length; i++){
			int x = Arrays.binarySearch(arr2,arr[i]);
			arr[i]=x+1;
		}
		int invcnt = 0;
		for(int i=arr.length-1; i>=0; i--){
			invcnt+=getSum(arr[i]-1,bit);
			update(arr[i],arr,bit,1);
		}
		return invcnt;
	}
	static void update(int index, int a[], int bit[], int k){
		int n=a.length;
		while(index<a.length){
			bit[index]+=k;
			index=index + (index & -index);
		}
	}
	
	static long getSum(int l, int[] bit){
		int sum=0;
		while(l>0){
			sum+=bit[l];
			l=l - (l & -l);
		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}