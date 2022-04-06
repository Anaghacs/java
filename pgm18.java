import java.util.Scanner;
public class pgm18
{
	public static void isAmstrong(int n)
	{
		int temp,digit=0,last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp=temp/10;
		}
		if(n==sum)
		
			System.out.println("this is a amstrong number");
		else
			System.out.print("This is not a amstrong number");
		
	}
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number:");
		num=sc.nextInt();
		isAmstrong(num);
	}
}
		