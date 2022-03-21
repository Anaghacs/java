import java.util.*;
public class pgm4
{
	public static void main(String [] args)
	{
		int num1,num2,mul;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your first number:");
		num1=input.nextInt();
		System.out.print("Enter your multiplication number:");
		num2=input.nextInt();
		mul=num1*num2;
		System.out.println("Product of the number:"+num1 + " * " +num2 +" = "+(mul));
	}
}
		

		