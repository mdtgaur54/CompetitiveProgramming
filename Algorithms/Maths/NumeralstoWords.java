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
/**
 * Created by mudit on 13/8/17.
 */
public class NumeralstoWords {

    static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] tens_powers = {"hundered", "thousand", "lakh", "crore"};
    private static String twoDigits(int n, String s){
        String str = "";
        if (n<20) str+=units[n];
        else str+=tens[n/10]+" "+units[n%10];
        if (n>0) str+=" "+s+" ";
        return str;
    }

    private static String convert(int n){
        String s = "";
        s+=twoDigits((n/10000000),tens_powers[3]);
        s+=twoDigits((n/100000)%100, tens_powers[2]);
        s+=twoDigits((n/1000)%100, tens_powers[1]);
        s+=twoDigits((n/100)%10, tens_powers[0]);
        s+=twoDigits(n%100, "");

        return s;
    }

    private static void solve() throws IOException{
        Reader r = new Reader();
        PrintWriter w = new PrintWriter(System.out);
        r.init(System.in);

        int n = r.ni();
        if(n==0) w.print(0);
        else w.print(convert(n));
        /*if (x>=1 && x<10){
            w.println(units[x%10]);
        } else if(x>=10 && x<20) {
            w.println(units[x%20]);
        } else if(x>=20 && x<100) {
            boolean f = false;
            StringBuilder sb1 = new StringBuilder();
            String[] ar1 = new String[2];
            if(x%10==0){
                w.print(tens_multiples[x/10]);
                f = true;
            } else {
                sb1.append(units[x%10]+" ");
                sb1.append(tens_multiples[x/10]+" ");
                ar1 = sb1.toString().split(" ");
            }

            if (!f){
                w.print(ar1[1]+" "+ar1[0]);
            }
        } else if(x>=100 && x<1000){
            int a = x%10;
            x/=10;
            int b = x%10;
            x/=10;
            int c = x%10;
            w.print(units[c]+" "+tens_powers[0]+" ");
            if(b==1){
                w.print(units[a+10]);
            } else if(b==0){
                w.print(units[a]);
            } else {
                if(a==0){
                    w.print(tens_multiples[b]);
                } else {
                    w.print(tens_multiples[b]+" "+units[a]);
                }
            }
        } else if(x>=1000 && x<10000){
            int a = x%10; x/=10; int b = x%10; x/=10;
            int c = x%10; x/=10; int d = x%10;
            w.print(units[d]+" "+tens_powers[1]+" ");
            if (c!=0){
                w.print(units[c]+" "+tens_powers[0]+" ");
                if(b==1){
                    w.print(units[a+10]);
                } else if(b==0){
                    w.print(units[a]);
                } else {
                    if(a==0){
                        w.print(tens_multiples[b]);
                    } else {
                        w.print(tens_multiples[b]+" "+units[a]);
                    }
                }
            }
        } else if(x>=10000 && x<100000){
            int a = x%10; x/=10; int b = x%10; x/=10;
            int c = x%10; x/=10; int d = x%10; x/=10; int e = x%10;

        }*/
        w.flush();
    }
    public static void main(String[] args) throws IOException{
        solve();
    }
}
