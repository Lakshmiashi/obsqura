package Inheritance;

public class childclass extends ParentB{

	 public void display3()
	 {
		 System.out.println("This is chid class");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass obj=new childclass();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}
