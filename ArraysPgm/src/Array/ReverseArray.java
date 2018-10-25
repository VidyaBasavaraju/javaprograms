package Array;

import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		
		Scanner Sc=new Scanner(System.in);
		
		
		
		System.out.println("enter the size:");
		int size=Sc.nextInt();
		int ar[]=new int[size];
		
		System.out.println("enter the elements:");
		for(int i=0;i<ar.length;i++)
		
		{
		ar[i]=Sc.nextInt();	
		}
		System.out.println("entered elemets are:");
		for(int i=0;i<ar.length;i++)
			{
			System.out.println("ar["+i+"]------->>>:"+ar[i]);
			
			}
			System.out.println("reversing:");
			for(int i=0;i<ar.length/2;i++)
			{
				int t=ar[i];
				ar[i]=ar[ar.length-1-i];
				ar[ar.length-1-i]=t;
				
			}
			System.out.println("after revesing");
			for(int i=0;i<ar.length;i++)
			{
			System.out.println("revesed elements ae:+ar["+i+"]--------------->:"+ar[i]);
		    }
	}
}


