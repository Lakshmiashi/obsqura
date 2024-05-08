package Exception;

public class Customexceptioneg {
	public static void main(String[] args) throws EligibilityException {
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
	}
		else
		{
			throw new EligibilityException("Not Eligible");  //customized exception age
		}

}
}
