
public class methodOverlloding2 
{
	public void m1(String s)
	{
		System.out.println("string version");
	}

	public void m1(StringBuffer SB)
	{
		System.out.println("object version");

}
	
public static void main(String[] args) 
{
	methodOverlloding2 t2=new methodOverlloding2();

//	t2.m1(null);
	
	
	//t2.m1(new StringBuffer(null));
}	
	
}
