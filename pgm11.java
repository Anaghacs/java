import java.util.*;
public class pgm11
{
	public static void main(String[] args)
	{
		double x,y,z;
		Scanner in=new Scanner(System.in);
		System.out.print("eneter your first number:");
		x=in.nextDouble();
		System.out.print("Enter your second number:");
		y=in.nextDouble();
		System.out.print("Enter your third number:");
		z=in.nextDouble();
		System.out.print("The smallest number is="+Smallest(x,y,z)+"\n");
	}
	public static double Smallest(double x,double y,double z)
	{
		return Math.min(Math.min(x,y),z);
	}
}
		