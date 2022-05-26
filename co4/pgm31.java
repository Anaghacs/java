import org.shapes.*;
import java.util.*;
class pgm31
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

output
******

Enter the side of the Square:
5
Area of square is25
Enter the radius of the circle:
6
Area of the circle is 78.5
Enter the side1 of the triangle:
2
Enter the side2 of the triangle:
5
Enter the side3 of the triangle:
4
Area of the triangle is :2.0