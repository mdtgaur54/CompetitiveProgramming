package SPOJ.Classical;

import java.util.Scanner;

public class COINS {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong()){
		long n = sc.nextLong();
		long result = coins(n);
		System.out.println(result);
		}
	}
	static long[] arr = new long[1000000];
	public static long coins(long n){
		int size=1000000;
		if(n<12)
			return n;
		if(n<size){
				if(arr[(int)n]>0)
					return arr[(int)n];
		}
		long m = Math.max(n,coins(n/2)+coins(n/3)+coins(n/4));
		if(n<size) arr[(int)n]=m;
		return m;
	}

}
