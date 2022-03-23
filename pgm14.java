import java.util.*;
public class pgm14
{
	public static void main(String args [])
	{
		int max=0,prev=0,next=1;
		Scanner obj=new Scanner(System.in);
		System.out.print("How many numbers you want in fibonaci :");
		max=obj.nextInt();
		System.out.print("Fibonacci series of " + max +" number:");
		for(int i=1;i<=max;i++)
		{
			System.out.print(prev+" \n ");
			int sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}
