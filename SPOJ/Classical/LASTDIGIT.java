package SPOJ.Classical;
import java.util.*;
public class LASTDIGIT {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int pow = b%4;
			a%=10;
			if(b==0){
				System.out.println(1);
				continue;
			}
			if(pow==0)
				a=a*a*a*a;
			else if(pow==1)
				a=a;
			else if(pow==2)
				a=a*a;
			else if(pow==3)
				a=a*a*a;
			System.out.println(a%10);
		}
	}
}
