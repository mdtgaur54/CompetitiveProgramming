package SPOJ.Classical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FIBOSUM {
	private static void solve() throws IOException{
		Reader r = new Reader();
		PrintWriter w = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
		r.init(System.in);
		int t = r.ni();
		long mod = 1000000007;
		while(t-->0){
			
			int n = r.ni(), m = r.ni();
			long sum1=pow(n+1);
			long sum2=pow(m+2);
			long sum = (sum2-sum1+mod)%mod;
			w.println(sum);
		}
		
		w.flush();
	}
	
	static long pow(int n) {
		long MODULOS = 1000000007;
		long[][] temp = new long[2][2];  
        long[][] matrix = new long[][] {{1, 0}, {0, 1}}, power = new long[][] {{1, 1}, {1, 0}};

        while (n != 0) {
            if ((n&1) == 1) {
                temp[0][0] = (matrix[0][0]*power[0][0] + matrix[0][1]*power[1][0]) % MODULOS;
                temp[0][1] = (matrix[0][0]*power[0][1] + matrix[0][1]*power[1][1]) % MODULOS;
                temp[1][0] = (matrix[1][0]*power[0][0] + matrix[1][1]*power[1][0]) % MODULOS;
                temp[1][1] = (matrix[1][0]*power[0][1] + matrix[1][1]*power[1][1]) % MODULOS;
                matrix[0][0] = temp[0][0];
                matrix[0][1] = temp[0][1];
                matrix[1][0] = temp[1][0];
                matrix[1][1] = temp[1][1];
            }

            temp[0][0] = (power[0][0]*power[0][0] + power[0][1]*power[1][0]) % MODULOS;
            temp[0][1] = (power[0][0]*power[0][1] + power[0][1]*power[1][1]) % MODULOS;
            temp[1][0] = (power[1][0]*power[0][0] + power[1][1]*power[1][0]) % MODULOS;
            temp[1][1] = (power[1][0]*power[0][1] + power[1][1]*power[1][1]) % MODULOS;
            power[0][0] = temp[0][0];
            power[0][1] = temp[0][1];
            power[1][0] = temp[1][0];
            power[1][1] = temp[1][1];

            n /= 2;
        }

        return matrix[0][1];
    }
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}