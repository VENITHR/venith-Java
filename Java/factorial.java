import java.util.*;
public  class factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,a,b=1;
		System.out.println("Enter a Number to Find a Factorial:");
		a=sc.nextInt();
		
		for(i=1;i<=a;i++)
		{
		b=b*i;
		}
		System.out.println("The Factorial Number is:"+b);
	}
}