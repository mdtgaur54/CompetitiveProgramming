package SPOJ.Classical;

import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class FCTRL2 {
 
    public static void main(String[] args) throws IOException{
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
        while(t>0){
	        int n = Integer.parseInt(br.readLine());
	        BigInteger n1 = BigInteger.valueOf(n);
	        BigInteger fact= new BigInteger("1");
	        for(int i=1; i<=n; i++){
	            fact=fact.multiply(BigInteger.valueOf(i));
	        }
	        sb.append(fact);
	        sb.append("\n");
        	t--;
        }
        System.out.println(sb);
    }
} 