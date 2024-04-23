package Aggrigation;
import java.util.*;
public class Student {
	String name;
	int rollno;
	public Student()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Student Name :");
		name=obj.nextLine();
		System.out.println("RollNo       :");
		rollno=obj.nextInt();
		
	}

}
