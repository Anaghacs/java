import java.util.*;
public class pgm9
{
	public static void main(String args [])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your first number:");
		int x=in.nextInt();
		System.out.print("Enter your second number:");
		int y=in.nextInt();
		System.out.print("Enter your third number:");
		int z=in.nextInt();
		System.out.println("The result is:" +Sumoftwo(x,y,z));
	}
		public static boolean Sumoftwo(int p,int q,int r)
		{
			return((p+q)==r||(q+r)==p||(r+p)==q);
		}
}