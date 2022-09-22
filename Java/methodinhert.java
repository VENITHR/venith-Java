class A
{
	int i;
	void loop1()
	{
		for(i=0;i<=15;i++)
		{
			System.out.println(i);
		}
	}
	
}
class B extends A
{
	void disp()
	{
		super.loop1();
	}
}
class  methodinhert
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp();
	}
}