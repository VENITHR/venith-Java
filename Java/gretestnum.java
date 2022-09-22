import java.util.*;
public class gretestnum
{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number:");
	int a;
	a=sc.nextInt();
	System.out.println("Enter the First Number:");
	int b;
	b=sc.nextInt();
	System.out.println("Enter the First Number:");
	int c;
	c=sc.nextInt();
	if(a>b && a>c)
		{
		System.out.println("A is Greater");
		}
	else if (b>c)
		{
		System.out.println("B is greater");
		}
	else	
		{
		System.out.println("C is greater");
		}
	}
}