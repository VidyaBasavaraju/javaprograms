package pack1;

import java.util.ArrayList;

public class ArraylistDemo 
{
	public static void main(String[] args) 
	{
	
		ArrayList l1=new ArrayList();
		
		
		
		l1.add("a");
		l1.add(10);
		l1.remove(1);
		l1.add("b");
		l1.add(null);
		l1.add("b");
		l1.add("d");
		l1.add("c");
		l1.add("e");
		l1.add(1);
		l1.add("vidya");
		l1.add(12);
		l1.add("z");
		System.out.println("array size is:"+l1.size());
		System.out.println("check wheher empty are nt:"+l1.isEmpty());
        
	
	
	l1.add(new Student(1,"vidya",60.02));
	
	l1.add(new Student(2,"komal",65.02));
	
	l1.add(new Student(1,"giri",70.02));
	l1.add(new Student(6,"rani",60.02));
	l1.add(new Student(9,"vrishab",80.02));
	l1.add(new Student(10,"priya",67.02));
	
	//Student s1=(Student)l1.get(0);
	//s1.marks=89.00;
	
	System.out.println("List elemts are:");
	
for(int i=0;i<l1.size();i++)
{
	System.out.println(l1.get(i));
}
	
	
	
	
	}

}
