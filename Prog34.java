//eg of static block


class Prog34
{
	static int a=10,b;
	
	public static void meth(int c)
	{
		System.out.println("Invocation of meth()");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);

	}
	
	public static void main(String args[])
	{
		System.out.println("Invocation of main()");
		//meth(100);
	}
	
	static
	{
		System.out.println("Invocation of static block1");
	}
	static
	{
		System.out.println("Invocation of static block2");
		b=a*5;
		meth(100);
	}
}
