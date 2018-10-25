package Array;

import java.util.Scanner;

public class ReversedArray 
{

	public static void main(String[] args)
	
	{
		
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=Sc.nextInt();
		
		int a[]=new int[size];
		
		
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=Sc.nextInt();
			//System.out.println("enterd elements before reversed");
			
		}
		
		System.out.println("enterd elemts after revesres");
		int temp=0;

		for(int i=0;i<a.length/2;i++)
		{
			temp=a[a.length-1-i];
			a[a.length-1-i]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++)

			{System.out.println("revesed:a["+i+"]---------->>"+a[i]);}
			
			
		
		
		
	}
}
