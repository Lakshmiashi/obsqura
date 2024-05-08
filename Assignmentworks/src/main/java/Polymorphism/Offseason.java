package Polymorphism;
public class Offseason extends Onseason {
   
	 public void discount(int t) 
	 {
		 
		 int dis=(t*15)/100;
		  t=t-dis;
		 System.out.println("Total Amount(Offseason):"+t);
		 super.discount(1000);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason obj=new Offseason();
		obj.discount(1000);
		

	}

}
