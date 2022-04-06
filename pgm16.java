import java.util.*;
public class pgm16
{
	public static void main(String args [])
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the value A:");
		int a=input.nextInt();
		System.out.println("Enter the value of B:");
		int b=input.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Number in A:"+a);
		System.out.println("Number in B:"+b);
	}
}