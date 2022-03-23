import java.util.*;
public class pgm15
{
	public static void main(String args [])
	{
		int max=10;
		System.out.print("Fibonacci series of" + max +" number:");
		for(int i=0;i<max;i++)
		{
			System.out.println(fibonacciRecursion(i)+" ");
		}
	}
	public static int fibonacciRecursion(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		return fibonacciRecursion(n-2)+fibonacciRecursion(n-1);
	}
}
			