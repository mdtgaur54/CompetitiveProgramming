package Algorithms.Sorting;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class MergeSort {
	
	private static int[] a;
	
	private static void merge(int p, int q, int r){
		
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i=0; i<n1; i++)
			L[i] = a[p+i];
		for(int j=0; j<n2; j++)
			R[j] = a[q+j+1];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i=0, j=0;
		for(int k=p; k<=r; k++){
			if(L[i]<=R[j]){
				a[k] = L[i];
				i++;
			}
			else{
				a[k] = R[j];
				j++;
			}
		}
		
	}
	
	private static int[] mergeSort(int p, int r){
		
		int q;
		if(p<r){
			q = (p+r)/2;
			mergeSort(p, q);
			mergeSort(q+1, r);
			merge(p,q,r);
		}
		return a;
	}
	
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		a = new int[n];
		for(int  i=0; i<a.length; i++)
			a[i] = r.ni();
		a = mergeSort(0, n-1);
		for(int i=0; i<n; i++)
			w.print(a[i] + " ");
		w.flush();
	}
	public static void main(String[] args) throws IOException{
		solve();
	}
}