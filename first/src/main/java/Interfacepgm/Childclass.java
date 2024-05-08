package Interfacepgm;

public class Childclass implements Interfaceone, Interfacetwo {

	@Override                       //Multiple Inheritance
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Second  parent interface method.");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
      System.out.println("first parent  interface method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.display();
		obj.display2();
	}

}
