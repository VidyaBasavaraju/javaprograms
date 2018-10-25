package lumendata;

public class MyClass
{
	public static void main(String[] args) 
	{
		MyClass a;
		MySubClass b;
		
		
		
		
		a=new MyClass();//(a)
		b=new MySubClass();//(b)
		
		
		a=b;//(3)
		b=a;//(4)
		a=new MySubClass();//(5)
		
		
		
		
		
	}
	

}
