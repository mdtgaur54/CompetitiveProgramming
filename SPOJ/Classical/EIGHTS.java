package SPOJ.Classical;

import java.util.Scanner;

public class EIGHTS {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0){
			long n = sc.nextLong();
			long result = (n-1) * 250 + 192;
			System.out.println(result);
		}
	}

}
