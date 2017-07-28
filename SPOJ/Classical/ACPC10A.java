package SPOJ.Classical;

import java.util.*;
public class ACPC10A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b){
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			if(a1==0 && a2==0 && a3==0)
				return;
			if(AP(a1,a2,a3)){
				int d = a3-a2;
				int a4 = a3+d;
				System.out.println("AP"+" "+a4);
			}
			else if(GP(a1,a2,a3)){
				int r = a3/a2;
				int a4 = a3*r;
				System.out.println("GP"+" "+a4);
			}
		}
	}
	static boolean AP(int a1, int a2, int a3){
		if(a2-a1==a3-a2)
			return true;
		return false;
	}
	
	static boolean GP(int a1, int a2, int a3){
		if(a2/a1==a3/a2)
			return true;
		return false;
	}
}
