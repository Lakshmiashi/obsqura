package Exception;  //eg of finally

public class ClassA {
	public static void main(String args[])
	{
		try
		{
int a=10;
int b=0;
int c=a/b;
System.out.println(c);
System.out.println("Hello");
       }
		catch(ArithmeticException obj)
		{
			System.out.println("An Error occured"+obj);//obj contains exception detailes.
		}
		finally
		{
			System.out.println("Hello successfully completed.");
		}
}
}
