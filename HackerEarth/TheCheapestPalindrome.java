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
 * Created by mudit on 21/8/17.
 */
public class TheCheapestPalindrome {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0){
            String s = r.next();
            int aCost = r.ni(), bCost = r.ni();
            char[] a = s.toCharArray();
            int min = Math.min(aCost,bCost);
            int ans = 0;
            for (int i=0; i<a.length/2; i++){
                if(a[i]!=a[a.length-i-1]){
                    if (a[i] == '/') {
                        if(a[a.length-i-1]=='a'){
                            ans+=aCost;
                            a[i]='a';
                        }
                        else{
                            ans+=bCost;
                            a[i]='b';
                        }
                    } else if(a[a.length-i-1]=='/') {
                        if (a[i]=='a'){
                            ans+=aCost;
                            a[a.length-i-1]='a';
                        }
                        else{
                            ans+=bCost;
                            a[a.length-i-1]='b';
                        }
                    }
                } else if(a[i]==a[a.length-i-1]&&a[i]=='/' && a[a.length-i-1]=='/') ans+=2*min;
                if(a.length/2!=0 && i==a.length/2 && a[i]=='/') ans+=min;
            }
            if (!checkPalin(a) || ans==0) w.println(-1);
            else w.println(ans);
        }
        w.flush();
    }
    static boolean checkPalin(char[] a){
        for (int i=0; i<a.length; i++){
            if(a[i]!=a[a.length-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
