package methods;

public class R
{
	static int x=10;
	static void test()
	{
		int x=20;
		x=40;
		//R.x=60;
		System.out.println(x);

	System.out.println(R.x);
	
	
	}
public static void main(String[] args)
{
System.out.println("main;"+x);
test();
System.out.println(x);
System.out.println("main end:"+R.x);
System.out.println(x);
}
}
