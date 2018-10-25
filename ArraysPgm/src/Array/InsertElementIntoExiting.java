package Array;

import java.util.Scanner;

public class InsertElementIntoExiting 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size:");
		
		
		
		
		int length=Sc.nextInt();
		int ar[]=new int[length];
		System.out.println("enter the elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=Sc.nextInt();
		}	
	
	System.out.println("array elements are:");
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("ar["+i+"]---------------->>>>>:"+ar[i]);
	
	}
	
	//creating new array
	
//System.out.println("enter the size:");
int length1=Sc.nextInt();

int ar1[]=new int[length+1];

System.out.println("enter the elemets:");
for(int i=0;i<ar1.length;i++)
{
ar[i]=Sc.nextInt();
}
	
System.out.println("enterd elements are:");
for(int i=0;i<ar1.length;i++)
{
System.out.println("ar1["+i+"]----------->>:"+ar[i]);
}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
