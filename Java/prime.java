import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b=0,c,i;
		System.out.println("Enter A Number To Find Its prime or not:");
		a=sc.nextInt();
	
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				b++;

			}
		}
		if(b==2)
		{
			System.out.println("its is an prime number"+a);
		}
		else
		{
			System.out.println("its is an not a prime number"+a);
		}
	}

}