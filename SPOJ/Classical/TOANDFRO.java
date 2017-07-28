package SPOJ.Classical;
import java.util.*;
public class TOANDFRO {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;
			String s = sc.next();
			char[] arr = s.toCharArray();
			int m = s.length()/n;
			char[][] ar = new char[m][n];
			int k=0;
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					ar[i][j]=arr[k];
					k++;
				}
			}
			char[][] ar2 = new char[m][n];
			int p=0,q=0;
			for(int i=0; i<m; i++){
				q=0;
				if(i%2==0){
					for(int j=0; j<n; j++){
						ar2[p][q]=ar[i][j];
						q++;
					}
				}
				else{
					for(int j=n-1; j>=0; j--){
						ar2[p][q]=ar[i][j];
						q++;
					}
				}
				p++;
			}
			for(int i=0; i<n; i++){
				for(int j=0; j<m; j++){
					System.out.print(ar2[j][i]);
				}
				//System.out.println();
			}
			System.out.println();
		}
	}
}
