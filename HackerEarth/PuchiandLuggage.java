package HackerEarth;
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
 * Created by mudit on 15/9/17.
 */
public class PuchiandLuggage {

    private  long merge(long[] a,int p, int q, int r){

        int n1 = q-p+1;
        int n2 = r-q;
        long[] L = new long[n1+1];
        long[] R = new long[n2+1];

        for(int i=0; i<n1; i++)
            L[i] = a[p+i];
        for(int j=0; j<n2; j++)
            R[j] = a[q+j+1];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i=0, j=0;
        long invcnt = 0;
        for(int k=p; k<=r; k++){
            if(L[i]<=R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
                invcnt=invcnt+L.length-i-1;
            }
        }
        return invcnt;

    }

    private long mergeSort(long[] a,int p, int r){
        int q;
        long count=0;
        if(p<r){
            q = (p+r)/2;
            count+=mergeSort(a,p, q);
            count+=mergeSort(a,q+1, r);
            count+=merge(a,p,q,r);
        }
        return count;
    }

    private void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while(t-->0){
            int n = r.ni();
            long[] a = r.nla(n);
            long c = mergeSort(a,0, n-1);
            w.println(c);
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        new PuchiandLuggage().solve();
    }
}

