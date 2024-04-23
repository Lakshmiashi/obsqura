package Superkeywordassignment;
import java.util.*;
public class ChiledA extends ParentA {

	public ChiledA()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers  :");
		int x=obj.nextInt();
		int b=obj.nextInt();
	  int a=super.add(x,b);
	  System.out.println(x+" + "+b+" ="+a);
	}
	public void div()
	{
		int x=super.c;
	 if((super.c%10)!=0)
		 System.out.println("Not divisible by 10");
	 else
		 System.out.println("Divisible by 10");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChiledA obj=new ChiledA();
		obj.div();
		

	}

}
