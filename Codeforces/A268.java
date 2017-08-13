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

public class A268 {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int n = r.ni();
        Uniforms[] a = new Uniforms[n];
        for (int i=0; i<n; i++){
            a[i] = new Uniforms(r.ni(), r.ni());
        }
        int ans=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i!=j && a[i].getHome()==a[j].getGuest()) ans++;
            }
        }
        w.println(ans);
        w.flush();
    }
    static class Uniforms{
        int home, guest;

        Uniforms(int home, int guest){
            this.home=home;
            this.guest=guest;
        }

        int getHome(){return home;}
        int getGuest(){return guest;}

    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
