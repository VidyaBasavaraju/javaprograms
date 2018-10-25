package pack1;

public class Student
{
	int rollno;
	String name;
	double marks;
	
	public Student(int rollno,String name,double marks) 
	{
		
		
		
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		
		
	}
		public String toString()
		{
			return "Student[rollno="+rollno+" ,name="+name+", marks="+marks+"]";
		}
		
	}


