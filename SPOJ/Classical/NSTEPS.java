package SPOJ.Classical;
import java.util.*;
public class NSTEPS {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			if(x==y){
				if(x%2==0 && y%2==0)
					System.out.println(x+y);
				else
					System.out.println(x+y-1);
			}
			else if(y==x-2){
				if(x%2==0 && y%2==0)
					System.out.println(x+y);
				else
					System.out.println(x+y-1);
			}
			else 
				System.out.println("No Number");
			t--;
		}
	}
}