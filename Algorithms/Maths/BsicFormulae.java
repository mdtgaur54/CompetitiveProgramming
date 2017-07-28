package Algorithms.Maths;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BsicFormulae {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		w.flush();
	}
	
	private static int fromDecimalToAnyBaseConversion(int n, int base){
		int sum = 0;
		while(n>0){
			sum+= n%base;
			n/=base;
		}
		return sum;
	}
	
	private static int GCD(int a, int b) {
		if (b==0) return a;
		return GCD(b,a%b);
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}



class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static BigInteger big;
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}
	static String next() throws IOException {
		while ( ! tokenizer.hasMoreTokens() ) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	static String rl() throws IOException{
		String s = reader.readLine();
		return s;
	}
	static int ni() throws IOException {
		return Integer.parseInt( next() );
	}
	static double nd() throws IOException {
		return Double.parseDouble( next() );
	}
	static long nl() throws IOException {
		return Long.parseLong( next() );
	}
	static BigInteger nb() throws IOException{
		return big = new BigInteger( next() );
	}
	static int[] nia(int n) throws IOException{
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i]=ni();
		return a;
	}
	static long[] nla(long n) throws IOException{
		long[] a = new long[(int)n];
		for(int i=0; i<n; i++) a[i]=nl();
		return a;
	}
	static double[] nda(int n) throws IOException{
		double[] a = new double[n];
		for(int i=0; i<n; i++) a[i]=nd();
		return a;
	}
	static char[] nca() throws IOException{
		char[] a = next().toCharArray();
		return a;
	}
	static BigInteger[] nba(int n) throws IOException{
		BigInteger[] a = new BigInteger[n];
		for(int i=0; i<n; i++) a[i]=nb();
		return a;
	}
	static int[][] ni2(int m, int n) throws IOException{
		int[][] a = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=ni();
			}
		}
		return a;
	}
	static long[][] nl2(long m, long n) throws IOException{
		long[][] a = new long[(int)m][(int)n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nl();
			}
		}
		return a;
	}
	static double[][] nd2(int m, int n) throws IOException{
		double[][] a = new double[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nd();
			}
		}
		return a;
	}
	static BigInteger[][] nb2(int m, int n) throws IOException{
		BigInteger[][] a = new BigInteger[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j]=nb();
			}
		}
		return a;
	}
}

class Parser
{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Parser()
    {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Parser(String file_name) throws IOException
    {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException
    {
        byte[] buf = new byte[64]; // line length
        int cnt = 0, c;
        while ((c = read()) != -1)
        {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException
    {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException
    {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException
    {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException
    {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException
    {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException
    {
        if (din == null)
            return;
        din.close();
    }
}