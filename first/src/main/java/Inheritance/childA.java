package Inheritance;  //hierarchical

public class childA extends ParentA {

	 public void display2()
	 {
		 System.out.println("This is chid classA");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childA obj=new childA();
		obj.display1();
		obj.display2();
	}

}
