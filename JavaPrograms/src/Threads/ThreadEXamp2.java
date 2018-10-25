package Threads;

public class ThreadEXamp2 extends Thread
{
	
	public void run()
	{
		System.out.println("this thread is executed by55555:"+Thread.currentThread().getName());
	}
	public void run1()
	{
		System.out.println("this thread is executed by66666:"+Thread.currentThread().getName());
	}

}
