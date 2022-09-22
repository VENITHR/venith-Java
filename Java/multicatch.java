import java.lang.*;
class multicatch
{
	public static void main(String args[])
	{
		try
		{
			int a[]={1,2,3,4,5};
			System.out.println(a[8]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fetching the data"+e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
			System.out.println("I am a Ful Stack Developer");

	}
}