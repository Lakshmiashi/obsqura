package Superkeyword;

public class ParentClass {
	String name="Super Keyword Demo-printing from parent class";
	public void addnum()
	{
		int c=0;
		int a=12;
		int b=20;
		c=a+b;
		System.out.println("Sum is(parent method):"+c);
		
	}
	ParentClass(String n)
	{
		System.out.println(n);
	}

}
