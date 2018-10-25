package Threads;

public class TestMain 
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		MyThread m1=new MyThread();
		System.out.println(m1.getName());
    Thread.currentThread().setName("vidya");
    System.out.println(Thread.currentThread().getName());
    
    
    System.out.println(10/0);
	}

}
