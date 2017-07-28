package SPOJ.Classical;
import java.util.*;
public class ABSYS {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
			sc.nextLine();
			String s = sc.nextLine();
			String[] str = s.split("\\s+");
			
			if(str[0].contains("machula")){
				int a = Integer.valueOf(str[2]);
				int b = Integer.valueOf(str[4]);
				int x = b-a;
				str[0] = Integer.toString(x);
			}
			else if(str[2].contains("machula")){
				int a = Integer.valueOf(str[0]);
				int b = Integer.valueOf(str[4]);
				int x = b-a;
				str[2] = Integer.toString(x);
			}
			else if(str[4].contains("machula")){
				int a = Integer.valueOf(str[0]);
				int b = Integer.valueOf(str[2]);
				int x = a+b;
				str[4] = Integer.toString(x);
			}
			for(int i=0; i<str.length; i++) 
				System.out.print(str[i]+" ");
		}
	}
}
