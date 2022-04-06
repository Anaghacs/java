import java.util.Scanner;
public class pgm17
{
	public static void main(String args[])
	{
		int j,i,count;
		System.out.print("Enter 2 limits:");
		Scanner sc1=new Scanner(System.in);
		int m=sc1.nextInt();
		int n=sc1.nextInt();
		System.out.print("prime numbers between the range "+m+" to"+n+" are");
		for(j=m; j<=n;j++)
		{
		count=0;
		for( i=1; i<=j; i++)
		{
	
		if(j%i==0)
		{
		count++;
		}	
		}
		if(count==2)	
		System.out.println(j+" ");
		}
	
		
	}
}