package SPOJ.Classical;
import java.util.*;
public class FASHION {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] men = new int[n];
			int[] women = new int[n];
			for(int i=0; i<n; i++)
				men[i]=sc.nextInt();
			for(int i=0; i<n; i++)
				women[i]=sc.nextInt();
			Arrays.sort(men);
			Arrays.sort(women);
			int sum = 0;
			for(int i=0; i<n; i++)
				sum+=men[i]*women[i];
			System.out.println(sum);
		}
	}
}
