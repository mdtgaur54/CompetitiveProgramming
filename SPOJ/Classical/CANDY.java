package SPOJ.Classical;
import java.util.*;
 class CANDY {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==-1)
				break;
			int[] pack = new int[n];
			int sum=0;
			for(int i=0; i<n; i++){
				pack[i]=sc.nextInt();
				sum+=pack[i];
			}
			if(sum%n!=0)
				System.out.println(-1);
			else{
			int avg = sum/n;
			int moves=0;
			for(int i=0; i<n; i++){
				if(pack[i]>avg)
					moves+= pack[i]-avg;
			}
			
			System.out.println(moves);
			}
		}
	}
}
