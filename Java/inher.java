//Single inheritance

class A
{
 int a=20;
}
class B extends A
{
	int c=super.a;
	int b=50;
	void output()
	{
	System.out.println(c+b);
	}
}
class inher
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.output();
	}
}