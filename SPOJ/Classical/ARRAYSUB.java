package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ARRAYSUB {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int n = r.ni();
		int[] a = r.nia(n);
		int k = r.ni();
		/*Deque<Integer> deque = new LinkedList<Integer>();
		for(int i=0; i<k; i++){
			deque.add(a[i]);
		}
		int maxi=max(deque);
		w.print(maxi);
		for(int i=k; i<n; i++){
			deque.removeFirst();
			deque.addLast(a[i]);
			w.println(deque);
			if(!deque.contains(maxi)){
				maxi=(max(deque));
			}
			else{
				maxi = Math.max(maxi,deque.getLast());
			}
			w.print(" "+maxi);
		}*/
		//w.println(deque);
		//w.print(" "+max(deque));
		int max=0;
		for(int i=0; i<=n-k; i++){
			max=a[i];
			for(int j=1; j<k; j++){
				if(a[i+j]>max) max=a[i+j];
			}
			w.print(max+" ");
		}
		w.flush();
	}
	/*static int max(Deque<Integer> al){
		int[] a = new int[al.size()];
		int k=0;
		for(int temp : al){
			a[k++]=temp;
		}
		int maxi = a[0];
		for(int i=1; i<a.length; i++){
			if(a[i]>maxi) maxi=a[i];
		}
		return maxi;
	}*/
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}

/*import java.io.*;
import java.util.*;

class arraysub {
	private static Reader in;
	private static PrintWriter out;

	public static void main(String[] args) throws IOException {
		in = new Reader();
		out = new PrintWriter(System.out, true);
		
		int N = in.nextInt();
		max_queue pq = new max_queue (N);
		int [] arr = new int [N];
		for (int i = 0; i < N; i++)
			arr [i] = in.nextInt();
		int K = in.nextInt();
		for (int i = 0; i < K; i++)
			pq.add (arr [i], i);
		for (int i = K; i < N; i++) {
			out.print (pq.query (i - K) + " ");
			pq.add (arr [i], i);
		}
		out.println(pq.query (N - K));
		out.close();
		System.exit(0);
	}
	
	static class max_queue {
		public int [] index, value;
		public int front, back, N;
		
		public max_queue (int N) {
			this.N = N;
			index = new int [N];
			value = new int [N];
			front = back = 0;
		}
		
		public void add (int val, int idx) {
			while (front < back && value [back - 1] < val) back--;
			value [back] = val;
			index [back++] = idx;
		}
		
		public int query (int idx) {
			while (front < back && index [front] < idx) front++;
			return front == back ? -Integer.MAX_VALUE : value [front];
		}
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1024];
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}*/