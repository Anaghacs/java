import java.util.Scanner;
public class OverloadShapeArea
{
	void calculateArea(float x)
	{
		System.out.println("Area of the square: "+x*x +" sq units");
	}
	void calculateArea(float x,float y)
	{
		System.out.println("Area of the reactangle: "+x*y+" sq units");
	}
	void calculatArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of the circle: "+area+"sq units");
	}
	public static void main(String args[])
	{
		OverloadShapeArea obj=new OverloadShapeArea();
		System.out.println("Enter the side of the square:");
		Scanner sc=new Scanner(System.in);
		float side=sc.nextFloat();
		System.out.println("Enter the sides of reactangle:");
		float side1=sc.nextFloat();
		float side2=sc.nextFloat();
		obj.calculateArea(side1,side2);
		System.out.println("Enter the radius of the circle:");
		double rad=sc.nextDouble();
		obj.calculateArea(rad);
	}
}