import java.util.*;
public class pgm13
{
	public static void main(String args [])
	{
		int prev=0,next=1,i=0,max=10;
		Scanner s1=new Scanner(System.in);
		System.out.print("Fibocci series " +max+"numbers\n");
		while(i<=max)
		{
			System.out.print(prev+" \n");
			int sum=prev+next;
			prev=next;
			next=sum;
			i++;
		}
	}
}