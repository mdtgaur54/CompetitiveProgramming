package SPOJ.Classical;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

class BISHOPS {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextBigInteger()){
			BigInteger n = sc.nextBigInteger();
			BigInteger one = new BigInteger("1");
			BigInteger ans= new BigInteger("0");
			if (n.compareTo(BigInteger.ONE) > 0){
			BigInteger x = new BigInteger("2");
			ans = x.multiply(n);
			ans=ans.subtract(x);
			}
			if(n.equals(one))
				System.out.println(n);
			else
				System.out.println(ans);
		}
	}	
}
