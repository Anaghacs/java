import java.util.*;
public class pgm5
{
	public static void main(String [] args)
	{
		double radius;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your radius of circle:");
		radius=input.nextDouble();
		System.out.println("Area of circle="+(Math.PI*radius*radius));
		System.out.println("Perimeter of the circle="+(2*Math.PI*radius));
	}
}
		