package Encapsulation;
import java.util.*;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Pinnumber:");
		int num=obj.nextInt();
		Bank b=new Bank();
		b.set(num);
		b.get();

	}

}
