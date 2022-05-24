import org.shapes.*;
import java.util.*;
class testpackage
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the Square:");
		int s=sc.nextInt();
		square sq=new square(s);
		System.out.println("Area of square is"+sq.area());
		
		System.out.println("Enter the radius of the circle:");
		int r=sc.nextInt();
		circle ci=new circle(s);
		System.out.println("Area of the circle is "+ci.area());
		
		System.out.println("Enter the side1 of the triangle:");
		int s1=sc.nextInt();
		System.out.println("Enter the side2 of the triangle:");
		int s2=sc.nextInt();
		System.out.println("Enter the side3 of the triangle:");
		int s3=sc.nextInt();
		triangle t=new triangle(s1,s2,s3);
		System.out.println("Area of the triangle is :"+t.area());
	}
}