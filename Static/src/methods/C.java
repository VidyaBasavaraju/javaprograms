package methods;

public class C 
{
	public static void main(String[] args) 
	{test2();
		System.out.println("main begin");
		test1();
		System.out.println("main end");
		
	}

	
	public static void test1()
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	 
	public static void test2()
	{
		System.out.println("from test2 begin");
		System.out.println("from test2 end");
	}
	
	
	
}
