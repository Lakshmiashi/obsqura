package Inheritance;  //multilevel inheritance

public class ClassC extends ClassB{

	public static void main(String args[])
	{
		ClassC obj2=new ClassC();
		obj2.salary();
		int a= obj2.bs;
		obj2.salary2(a);
	float total=obj2.bs+obj2.hra+obj2.pf-obj2.dd+obj2.bo;
		System.out.println("............salary slip...................");
		System.out.println("             Basicpay    :"+obj2.bs);
		System.out.println("             Deduction   :"+obj2.dd);
		System.out.println("             hra         :"+obj2.hra);
		System.out.println("             pf          :"+obj2.pf);
		System.out.println("             Bonus       :"+obj2.bo);
		System.out.println("             Total Salary:    :"+total);
	}
}


