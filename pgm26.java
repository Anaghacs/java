import java.util.*;
class pgm26
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner (System.in);
		String temp;
		System.out.println("Enetr the number of strings:");
		int max=Integer.parseInt(obj.nextLine());
		String[] str=new String[max];
		System.out.println("Enter the Strings:");
		for(int i=0; i<max; i++)
		{
			str[i]=obj.nextLine();
		}
		System.out.println("Before sort:");
		System.out.print(Arrays.toString(str) + "\t");
		for(int i=0; i<max; i++)
		{
			for(int j=i+1; j<max; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\nAfter sort:");
		System.out.print(Arrays.toString(str)+ "\t");
	}
}
