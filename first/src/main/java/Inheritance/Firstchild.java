package Inheritance; //single inheritance

public class Firstchild extends Firstparent {

	public void display2()
    {
 	System.out.println("This is child method");   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstchild obj=new Firstchild();
       obj.display2();
       obj.display();
	}

}
