package Inheritance;

import java.util.Scanner;

public class ClassA {
      int bs, dd,bo;
	public  void salary() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter basic pay:");
       bs=obj.nextInt();
        System.out.println("Enter deduction:");
         dd=obj.nextInt();
        System.out.println("Enter bonus:");
         bo=obj.nextInt();
	}

}
