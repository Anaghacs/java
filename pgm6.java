import java.util.*;
import java.io.*;
import java.lang.*;
class pgm6
{
	public static void main (String args[])
	{
		int sum=0;
		int temp;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your number:");
		int fnum=obj.nextInt();
		while(fnum>0)
		{
			temp=fnum%10;
			sum=sum+temp;
			fnum=fnum/10;
		}
		System.out.println("Sum of the digit="+sum);
		
	}
}