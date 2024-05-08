package Encapsulation;
public class Bank {

	  private int pin;
	  public void get()
	  {
		  if(pin==1001||pin==1234||pin==1212)
			  System.out.println("Valid Pinnumber");
		  else
			  System.out.println("Invalid Pinnumber");
	  }
	  public void set(int pin)
	  {
		  this.pin=pin;
	  }
}
