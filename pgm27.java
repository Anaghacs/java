import java.util.*;
import java.lang.String;
class pgm27
{
	public static void main(String args[])
	{
		String str1,str2,str;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=obj.next();
		System.out.println("The first string is : " +str1);
		System.out.println("The length of the first string:"+str1.length());
		System.out.println("Enter the second string : ");
		str2=obj.next();
		System.out.println("The second string is : " +str2);
		System.out.println("The length of the second string string:"+str2.length());
		str=str1.concat(str2);
		System.out.println("Concatination of two string :" +str);
		System.out.println("Character at position in :"+str.charAt(3));
		System.out.println("Index of the position : " +str.indexOf('o'));
		System.out.println("Convert to upper case:" +str.toUpperCase());
		System.out.println("Convert to the lower case :" +str.toLowerCase());
	}
}
		