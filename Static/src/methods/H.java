package methods;

public class H 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		int i=test();
		int j=i+test();
		System.out.println("the value of i:"+i);
		System.out.println("the value of j:"+j);
		
		
	}
	
	
	
	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
	
	
	

}
