import java.util.*;
public class pgm8
{
	public static void main(String args [])
	{
		String test="My name is anagha.c.s.@,123";
		Count(test);
	}
	public static void Count(String x)
	{
		char[] ch=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Letter=" +letter);
		System.out.println("Number=" +num);
		System.out.println("Other=" +other);
	}
}

