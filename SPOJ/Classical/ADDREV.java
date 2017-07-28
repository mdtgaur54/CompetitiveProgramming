package SPOJ.Classical;

import java.util.*;
public class ADDREV {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			a = reverse(a);
			b = reverse(b);
			int sum = a+b;
			sum = reverse(sum);
			System.out.println(sum);
			t--;
		}
	}
	static int reverse(int n){
		int rev = 0;
		while(n != 0){
			rev = rev * 10;
			rev = rev + n%10;
			n/=10;
		}
		return rev;
	}
}
