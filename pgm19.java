import java.util.*;
public class pgm19
{
	public static void main(String args [])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter a word:");	
		String str=sc1.nextLine();
		int size=str.length();
		boolean isPalindrome=true;
		for(int i=0;i <size/2;i++)
		{
			if(str.charAt(i)==str.charAt(size-i-1))
				continue;
			else
			{
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)
			System.out.println("The string "+ str +" is a palindrome");
		else
			System.out.println("The string "+str+ " is not a palindrome");
	}
}