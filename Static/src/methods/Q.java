package methods;

public class Q


{
static int x=9;
	public static void main(String[] args)
	{
		System.out.println("main:"+x);
test();		
		
System.out.println("main"+x);
		
}
	
	public static void test()
	{
		x=20;
	System.out.println(x);
	}

}
