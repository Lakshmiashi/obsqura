package Abstract;

public class Abstractionchild extends Abstractioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionchild obj=new Abstractionchild();
		obj.display2();
		obj.display();

	}

	@Override
	public void display2() {   //abstract method body in child cls
		// TODO Auto-generated method stub
		System.out.println("Abstract method.");
	}

}
