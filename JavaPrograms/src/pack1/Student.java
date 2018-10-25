package pack1;

public class Student extends Person 
{
	
	int marks;
	int id;
	

	Student(String name, String color, int heigth, int weight,int id,int marks) 
	{
	
		
		
		
		super(name, color, heigth, weight);
		
		
		
		this.name=name;
		
		this.color=color;
		this.heigth=heigth;
		this.weight=weight;
		this.id=id;
		this.marks=marks;
		
	}

	public void display()
	{
		System.out.println("student deatils");
		
		
		System.out.println(name);

		System.out.println("color pf the student:"+color);

		System.out.println("heigth pf the student:"+heigth);

		System.out.println("weight pf the student:"+weight);

		System.out.println("id pf the student:"+id);

		System.out.println("marks pf the student:"+marks);
		
		
		
	}
	
	
}
