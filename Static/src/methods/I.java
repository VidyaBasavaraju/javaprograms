package methods;

public class I 
{
	public static void main(String[] args)
	{
		System.out.println("from main");
	
		int i=test();
		int j=i+test();
		int k=i+test()+j+test();
		
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	System.out.println(test());
		
		
	}

	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
	
	
	
	
	
	
}
