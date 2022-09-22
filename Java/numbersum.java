import java.util.*;
public class numbersum
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a,i,b=0;
			System.out.println("Enter the value For ADD:");
			a=sc.nextInt();

			for(i=0;i<=a;i++)
				{
				b=b+i;
				}
				System.out.println("Sum of given value is :"+b);
		}
}