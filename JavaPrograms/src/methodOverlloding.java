
public class methodOverlloding 
{
	private void m1() throws Exception
	{
		System.out.println("no arg method");
	}

	static int m1(int i)
	{
		System.out.println("int arg");
		return i;
	}
	
	
	final void m1(float f)

	{
		System.out.println("float arg");
	}
	
	
	public static void main(String[] args) throws Exception
	{
		
		methodOverlloding t1=new methodOverlloding();
		//System.out.println(t1);
		t1.m1();
		t1.m1(10);
		t1.m1(10.5f);
		t1.m1('a');
		//t1.m1(101.5l);
		
		
		
		
	}
	
}
