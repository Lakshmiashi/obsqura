package Accessspecifier1;

public class Accessspecifiereg1 {
	public void display1()
	{
		System.out.println("This is public.");
	}
	private void display2()
	{
		System.out.println("This is private.");
	}
	protected void display3()
	{
		System.out.println("This is protected.");
	}
    void display4()
	{
		System.out.println("This is default.");
	}
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessspecifiereg1 obj=new Accessspecifiereg1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
		
	}

}
