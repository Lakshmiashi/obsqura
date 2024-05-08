package Interface;
import java.util.*;
public class Hdfc implements Rbi {

	@Override
	public void recurringDeposit() {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter amount:");
		int a=obj.nextInt();
		System.out.println("Enter duration in years:");
		int b=obj.nextInt();
		int interest=(a*b*r)/100;
		int p=a+interest;
		System.out.println("Amount get:"+p);

	}
	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.recurringDeposit();
	}

}
