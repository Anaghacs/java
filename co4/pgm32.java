import java.util.Scanner;
class Username extends Exception
{
	public Username(String msg)
	{
		super(msg);
	}
}
class Password extends Exception
{
	public Password(String msg)
	{
		super(msg);
	}
}
public class pgm32
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String username,password;
		System.out.println("Enter your username:");
		username=s.nextLine();
		System.out.println("Enter your password:");
		password=s.nextLine();
		int length=username.length();
		try
		{
			if(length < 6)
				throw new Username("Username must be greater than 6 characters");
			else if(!password.equals("hello"))
				throw new Password("Incorrect password\n Typecorrect password");
			else
				System.out.println("Login successful !!!");
		}
		catch (Username u)
		{
			u.printStackTrace();
		}
		catch(Password p)
		{
			p.printStackTrace();
		}
		finally
		{
			System.out.println("The finally statement is executed");
		}
	}
}

output
*****

Enter your username:
anagha
Enter your password:
hello
Login successful !!!
The finally statement is executed