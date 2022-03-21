import java.util.*;
public class pgm7
{
	public static void main(String args [])
	{
		Scanner input=new Scanner (System.in);
		System.out.print("Enetr your number:");
		int num=input.nextInt();
		for(int i=0;i<11;i++)
		{
			System.out.println(i+"*"+num+"="+(i*num));
		}
	}
}
