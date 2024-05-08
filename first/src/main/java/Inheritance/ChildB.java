package Inheritance; //hierarchical

public class ChildB extends ParentA {
	public void display3()
	{
		System.out.println("This is childB");
	}
	public static void main(String args[])
	{
		ChildB obj=new ChildB();
		obj.display1();
		obj.display3();
	}

}
