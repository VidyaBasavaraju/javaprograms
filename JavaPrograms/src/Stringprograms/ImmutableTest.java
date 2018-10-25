package Stringprograms;

public class ImmutableTest
{private int i;
	ImmutableTest(int i)
	{
		this.i=i;
	}
public ImmutableTest modify(int i) 
{
	
	
	
	if(this .i==i)
	{
	
	return this;
	}
	else
	{
		return (new ImmutableTest(i));
	}
	}
public static void main(String[] args) 
{
	ImmutableTest t1=new ImmutableTest(1);
	t1.modify(10);
}
}

