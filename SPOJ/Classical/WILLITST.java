package SPOJ.Classical;
import java.util.*;
public class WILLITST {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = n & (n-1);
		if(x==0) System.out.println("TAK");
		else System.out.println("NIE");
	}
}
