import java.util.*;
public class oddeven1
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a;
System.out.println("Enter the value :");
a=s.nextInt();

if(a % 2==0)
	{
	System.out.println(a+":its an Even value");
	}
else
	{
	System.out.println(a+":its is an odd value");
	}
}
}