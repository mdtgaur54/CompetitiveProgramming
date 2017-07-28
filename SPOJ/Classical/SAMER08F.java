package SPOJ.Classical;
import java.util.*;
public class SAMER08F {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			int result = numberOfSquares(n);
			System.out.println(result);
			
		}
	}
	static int numberOfSquares(int n){
		int result = (n*(n+1)*(2*n+1))/6;
		return result;
	}
}