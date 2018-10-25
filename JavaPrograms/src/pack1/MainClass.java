package pack1;

public class MainClass 
{
	public static void main(String[] args) {
		
	
	Student s=new Student("vidya","white",5,45,10,60);
	Student s1=new Student("vidya","white",5,45,10,60);
	s.display();
	s1.display();
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	
	
	
	System.out.println(s.hashCode());
	
	}

}
