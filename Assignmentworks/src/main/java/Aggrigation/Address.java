package Aggrigation;
import java.util.*;
public class Address {
	int rollno;
	String address;
	Student s;
	public   Address(Student s)
	{
		this.s=s;
		Scanner obj=new Scanner(System.in);
		System.out.println("Address:");
		address=obj.nextLine();
	}
	public void display()
	{
		System.out.println("Student Name:"+s.name+"     Rollno:"+s.rollno+"    Address:"+address);
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student b=new Student();
		Address c=new Address(b);
		c.display();

	}

}
