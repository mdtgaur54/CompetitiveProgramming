package Codeforces;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
/**
 * Created by mudit on 11/8/17.
 */
public class A510 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni(), m = r.ni();
        char[][] mat = new char[n][m];
        for (int i=0; i<n; i++){
            if(i%2==0) for (int j=0; j<m; j++) mat[i][j]='#';
            else {
                if(i==1 || mat[i-2][0]!='.') {
                    for (int j = 0; j < m - 1; j++) mat[i][j]='.';
                    mat[i][m-1]='#';
                }
                else {
                    for (int j = m-1; j>0; j--) mat[i][j]='.';
                    mat[i][0]='#';
                }
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                w.print(mat[i][j]);
            }
            w.println();
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
