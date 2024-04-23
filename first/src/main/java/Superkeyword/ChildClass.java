package Superkeyword;

public class ChildClass extends ParentClass {
	
	String name="Super keyword Demo-printing from child class";
	public void display()
	{
		System.out.println(name);
		System.out.println(super.name);    //refer parent cls instant variable using super keyword.
	}
	public void addnum()
	{
		int c=0;
		int a=55;
		int b=25;
		c=a+b;
		System.out.println("Sum is(child method):"+c);
		super.addnum();                      //refer parent cls instant method using super keyword.
		
	}
	ChildClass()
	{
	super("Test(parent constructor)");                          //refer parent cls constructor using super keyword.
	System.out.println("Constructor from child class");
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.display();
		obj.addnum();

	}

}
