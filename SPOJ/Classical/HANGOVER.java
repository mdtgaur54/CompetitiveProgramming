package SPOJ.Classical;
import java.util.*;
public class HANGOVER {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			float n = sc.nextFloat();
			if(n==0.00f)
				break;
			float sum = 0.00f,i=2.00f;
			int count=0;
			while(sum<=n){
				sum+=(1.00f/i);
				count++;
				i=i+1.00f;
			}
			System.out.println(count+" "+"card(s)");
		}
	}
}
