import java.util.*;
public class vote
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a;
System.out.println("Enter the value :");
a=s.nextInt();

if(a>=18)
	{
	System.out.println("Your Eligible for vote ");
	System.out.println("your are was:"+a);
	}
else
	{
	System.out.println("Your not eligible for vote");
	System.out.println("Because your age was under 18");
	}
}
}