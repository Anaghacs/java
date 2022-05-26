import java.util.ArrayDeque;
import java.util.Dequop;
import java.util.Scanner;

public class pgm38
{
public static void main(String args[])
{
int i,n=5;

Deque<String>dq=new ArrayDeque<String>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
for(i=1;i <= n;i++)
{
dq.add(sc.next());
}
System.out.println("Strings are:\n" +dq);
System.out.println("pop element\n" +dq.pop());
System.out.println("poll element\n" +dq.poll());
System.out.println("poll first element\n" +dq.pollFirst());
System.out.println("poll last element\n" +dq.pollLast());
}
}

output
_______

Enter the string
hello
anagha
have
a
nice day
Strings are:
[hello, anagha, have, a, nice]
pop element
hello
poll element
anagha
poll first element
have
poll last element
nice
PS G:\anagha\java\java\co4>


