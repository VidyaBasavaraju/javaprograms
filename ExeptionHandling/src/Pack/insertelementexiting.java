package Pack;

import java.util.Scanner;

public class insertelementexiting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		
		
		
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter   the elements");
for(int i=0;i<a.length;i++)                                          //1 2 3 4 5
	                                                                     //3===8
{
	a[i]=sc.nextInt();
	System.out.println("entered elemnts are:a["+i+"]----------->>:"+a[i]);

	
}

System.out.println("enter the index");
int index=sc.nextInt();

System.out.println("enter the value");
int val=sc.nextInt();

int b[]=new int[a.length+1];
for(int i=0;i<b.length;i++)

{
	if(index<0 &&index>a.length)
	{
		System.out.println("invalid index");
	
	}	
	if(i<index)
	{
		b[i]=a[i];
	
		
	}
	else if(i==index)
	{
		b[i]=val;
	}
	else 
	{
		b[i]=a[i-1];
	}
	
	
}
System.out.println("array elements rae:");
for(int i=0;i<b.length;i++)
{
	System.out.println("b["+i+"]----->>:"+b[i]);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
	}


