package Polymorphism;  //Method overriding.

public class ChildA extends ParentA {
	 public void add()
	 {
		 System.out.println("Child class");
		 super.add();    //invoke parent cls method.
	 }
	public static void main(String args[])
	{
		ChildA obj=new ChildA();
		obj.add();
		
		
	}

}
