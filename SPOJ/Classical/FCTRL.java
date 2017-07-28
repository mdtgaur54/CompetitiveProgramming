package SPOJ.Classical;
import java.util.Scanner;
public class FCTRL {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			long n = sc.nextLong();
			int c = 5;
			int zeroes = 0;
	
			while((n/c)>0){
				zeroes+=(n/c);
				c*=5;
			}
			System.out.println(zeroes);
			t--;
		}
	}
}