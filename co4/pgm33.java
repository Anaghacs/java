import java.util.*;
import java.io.IOException;
class MyException extends Exception
{
public MyException(String str)
  {
  System.out.println(str);
  }
}
public class pgm33
{
 public static void main(String args[])throws IOException
 {
  System.out.println("Enter number of inputs" );
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=0,sum=0;
  Integer mynumbers[]=new Integer[n];
  while(n>0)
  {
   try
   {
    System.out.println("Enter the numbers:");
    int num=sc.nextInt();
    if(num<0)
      throw new MyException("Nmber is negative");
    else
    {
    mynumbers[k]=num;
    sum=sum+num;
    k++;
    }
    n--;
   }
   catch(MyException m)
   {
    System.out.println(m);
   }
  }
  System.out.println("The average is: "+(sum/k));
 }
}


output

Enter number of inputs
2
Enter the numbers:
1
Enter the numbers:
-2
Nmber is negative
MyException
Enter the numbers:
1
The average is: 1
