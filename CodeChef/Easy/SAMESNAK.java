package CodeChef.Easy;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Points{
	long[] x = new long[2];
	long[] y = new long[2];
	char axis;
}

public class SAMESNAK {
	static Reader r  = new Reader();
	static PrintWriter w = new PrintWriter(System.out);
	StringBuilder sb = new StringBuilder();
	private static void solve() throws IOException{
		
		r.init(System.in);
		int t = r.ni();
		while(t-->0){
			sameSnake();
		}
		w.flush();
	}
	
	static public void sameSnake() throws IOException{
		//r.init(System.in);
		Points p1 = new Points();
		Points p2 = new Points();
		p1.x[0] = r.ni(); p1.y[0] = r.ni(); p1.x[1] = r.ni(); p1.y[1] = r.ni();
		p2.x[0] = r.ni(); p2.y[0] = r.ni(); p2.x[1] = r.ni(); p2.y[1] = r.ni();
		
		sort(p1);
		sort(p2);
		
		if(p1.axis == p1.axis){
			if(p1.axis =='y'){
				if(p1.x[0] > p2.x[0]){
					Points temp = p1;
					p1 = p2;
					p2 = temp;
			    }
			}else{
				if(p1.y[0] > p2.y[0]){
					Points temp = p1;
					p1 = p2;
					p2 = temp;
				}
			}
		}else{
			if(p1.axis == 'y'){
				Points temp = p1;
			    p1 = p2;
			    p2 = temp;
			}
		}
		
		if( p1.axis =='x' && p2.axis =='x'){
			xAxis(p1,p2);
		}else if(p1.axis =='y' && p2.axis =='y'){
			yAxis(p1,p2);
		}else{
			xyAxis(p1,p2);
		}

	}
	
	static public void sort(Points p){
		if(p.x[0] == p.x[1]){
			p.axis = 'x';
			if(p.y[0] > p.y[1]){
				long temp = p.y[0];
			    p.y[0] = p.y[1];
			    p.y[1] = temp;
			}
		}else{
			p.axis = 'y';
			if(p.x[0] > p.x[1]){
				long temp = p.x[0];
				p.x[0] = p.x[1];
				p.x[1] = temp;
			}
		}
	}
	
	static public void xAxis(Points p1, Points p2){
		if(p1.y[1] > p2.y[0]){
			w.println("yes");
		}else{
			w.println("no");
		}
	}

	static public void yAxis(Points p1,Points p2){
		if(p1.x[1] > p2.x[0]){
			w.println("yes");
		}else{
			w.println("no");
		}
	}
	static public void xyAxis(Points p1, Points p2){
		if((p1.x[0] == p2.x[1]) || (p1.x[1] == p2.x[0])){
			w.println("yes");
		}else{
			w.println("no");
		}
	}
	
	public static void main(String[] args) throws IOException{
		solve();
	}
}