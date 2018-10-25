package Array;

import java.util.Scanner;

public class InsrtElement 
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the Size:");
		int length=Sc.nextInt();
		
		
		int ar[]=new int[length];
		System.out.println("enter the elemens:");
		{for(int i=0;i<ar.length;i++)
		
		ar[i]=Sc.nextInt();	
		}	
		
		
		System.out.println("elements are:");

		
		for(int i=0;i<ar.length;i++)	
		{
			System.out.println("ar["+i+"]----->>"+ar[i]);
		}

		
	}

}