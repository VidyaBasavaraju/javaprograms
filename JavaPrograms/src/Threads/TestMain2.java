package Threads;

public class TestMain2 
{
	public static void main(String[] args) 
	{

		
		
		
		
		
		
		
		
		
		
		ThreadEXamp2 m2=new ThreadEXamp2();
		m2.start();
		System.out.println("this thread is executed by11111:"+Thread.currentThread().getName());
		m2.run1();
		System.out.println("this thread is executed by222222:"+Thread.currentThread().getName());
		
		
		ThreadEXamp2 m3=new ThreadEXamp2();
		m3.start();
		System.out.println("this thread is executed by333333:"+Thread.currentThread().getName());
		m2.run1();
		System.out.println("this thread is executed by44444:"+Thread.currentThread().getName());
	
	}

}
