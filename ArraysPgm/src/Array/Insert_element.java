package Array;

import java.util.Scanner;

public class Insert_element 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		
        int a[]=new int[size];
		
		
		
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("elements are  a["+i+"]--->>:"+a[i]);

			
		}
	
	
	}
	
	

}
