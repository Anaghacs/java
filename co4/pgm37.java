import java.util.Scanner;
import java.util.PriorityQueue;

public class pgm37
{
public static void main(String args[])
{
int i,n=5;

PriorityQueue<String> pq=new PriorityQueue<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the strings:   ");
for(i=1;i <= n;i++)
{
pq.add(sc.next());
}
System.out.println("Original queue:  " +pq);
pq.remove(4);
System.out.println("After removing: "+pq);
System.out.println("Poll method: "+pq.poll());
System.out.println("Final queue: "+pq);
System.out.println(pq.peek());
}
}

Enter the strings:
hello
welcome
anagha
have
nice day
Original queue:  [anagha, have, hello, welcome, nice day]
After removing: [anagha, have, hello, welcome, nice day]
Poll method: anagha
Final queue: [have, nice day, hello, welcome]
have