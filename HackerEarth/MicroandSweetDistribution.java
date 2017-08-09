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
 * Created by mudit on 5/8/17.
 */
public class MicroandSweetDistribution {
    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        r.init(System.in);
        int t = r.ni();
        while (t-->0) {
            int n = r.ni(), m = r.ni();
            int Sx = r.ni(), Sy = r.ni();
            int Dx = r.ni(), Dy = r.ni();
            final String L = "Left", R = "Right", B = "Back", F = "Front", O = "Over";
            if (Sx == 1 && Sy == 1) {
                if (Dx % 2 == 0) {
                    if (Dy == 1) {
                        if (Dx == n) w.println(O);
                        else w.println(B);
                    } else w.println(L);
                } else {
                    if (Dy == m) {
                        if (Dx == n) w.println(O);
                        else w.println(B);
                    } else w.println(R);
                }
            } else if (Sx == 1 && Sy == m) {
                if (Dx % 2 == 0) {
                    if (Dy == m) {
                        if (Dx == n) w.println(O);
                        else w.println(B);
                    } else w.println(R);
                } else {
                    if (Dy == 1) {
                        if (Dx == n) w.println(O);
                        else w.println(B);
                    } else w.println(L);
                }
            } else if (Sx == n && Sy == 1) {
                Dx = n - Dx + 1;
                if (Dx % 2 == 0) {
                    if (Dy == 1) {
                        if (Dx == 1) w.println(O);
                        else w.println(F);
                    } else w.println(L);
                } else {
                    if (Dy == m) {
                        if (Dx == 1) w.println(O);
                        else w.println(F);
                    } else w.println(R);
                }
            } else if (Sx == n && Sy == n) {
                int x = n - Dx + 1;
                if (Dx % 2 == 0) {
                    if (Dy == m) {
                        if (Dx == 1) w.println(O);
                        else w.println(F);
                    } else w.println(R);
                } else {
                    if (Dy == 1) {
                        if (Dx == 1) w.println(O);
                        else w.println(F);
                    } else w.println(L);
                }
            }
        }
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
