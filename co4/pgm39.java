import java.util.HashSet;
import java.util.Scanner;
 
public class pgm39
{
public static void main(String args[])
{
int i,n=5;

HashSet<Integer> hs1=new HashSet<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the firsthashset");
for(i=1;i <= n;i++)
{
hs1.add(sc.nextInt());
}
System.out.println("first hash set:" +hs1);

//second hashset

HashSet<Integer> hs2=new HashSet<Integer>();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the second hashset");
for(i=1;i <= n;i++)
{
hs2.add(sc1.nextInt());
}
System.out.println("second hash set:" +hs2);
System.out.println("first hash set is equal to second hashset:   " +hs1.equals(hs2));

//remove
hs2.remove(2);
System.out.println("second hash set after removing an element:  " +hs2);
System.out.println("first hash set is equal to second hashset:   " +hs1.equals(hs2));

}
}

output
******

Enter the first hash set
1 2 3
2
4
first hash set:[1, 2, 3, 4]
Enter the second hash set
5
6
7
8
9
second hash set:[5, 6, 7, 8, 9]
first hash set is equal to second hash set:   false
second hash set after removing an element:  [5, 6, 7, 8, 9]
first hash set is equal to second hash set:   false