package Abstract;
import java.util.*;
public class Contractor  extends Employee {
	int sal,x=200;
	public void calculatesalary1()
	{
		sal=x*8;
		System.out.println("full time employee salary:"+sal);
		
	}
	public void calculatesalary()
	{
		System.out.println("per hour salary:"+x);
		System.out.println("Enter working hours:");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int sal=x*a;
		System.out.println(" Employee salary per hour:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj=new Contractor();
		obj.calculatesalary();
		obj.calculatesalary1();

	}

}
