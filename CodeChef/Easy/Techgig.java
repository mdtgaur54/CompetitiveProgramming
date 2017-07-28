package Easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Techgig {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y,x1,y1;
		x=sc.nextInt();
		y=sc.nextInt();
		x1=sc.nextInt();
		y1=sc.nextInt();
		HashSet<Cord> st1 =new HashSet<Cord>();
		HashSet<Cord> st2 =new HashSet<Cord>();
		int size=1;
		Cord c = new Cord(x,y);
		Cord cc = new Cord(x1,y1);
		st2.add(c);
		while(true)
		{
			Iterator<Cord> itr=st2.iterator();
			while(itr.hasNext())
			{
				Cord ctmp=itr.next();
				int xtmp=ctmp.x;
				int ytmp=ctmp.y;
				Cord c1=new Cord(xtmp+1, ytmp+2);
				st1.add(c1);
				Cord c2=new Cord(xtmp-1, ytmp+2);
				st1.add(c2);
				Cord c3=new Cord(xtmp-2, ytmp+1);
				st1.add(c3);
				Cord c4=new Cord(xtmp-2, ytmp-1);
				st1.add(c4);
				Cord c5=new Cord(xtmp+2, ytmp+1);
				st1.add(c5);
				Cord c6=new Cord(xtmp+2, ytmp-1);
				st1.add(c6);
				Cord c7=new Cord(xtmp-1, ytmp-2);
				st1.add(c7);
				Cord c8=new Cord(xtmp+1, ytmp-2);
				st1.add(c8);
				
			}
			int xx=0,yy=0;
			Iterator<Cord> itr1=st1.iterator();
			while(itr1.hasNext())
			{
				Cord ct=itr1.next();
				xx=ct.x;
			    yy=ct.y;
				
				if(xx==x1&&yy==y1)
				{
					System.out.println(size);
					break;
				}
			
			}	
			if(xx==x1&&yy==y1)
			{
				break;
			}
			{
				size++;
				st2.clear();
				st2=(HashSet)st1.clone();
				st1.clear();
				
				
			}
		}
	}
}



class Cord {
int x,y;

Cord(int x,int y)
{
	this.x=x;
	this.y=y;
}
}
