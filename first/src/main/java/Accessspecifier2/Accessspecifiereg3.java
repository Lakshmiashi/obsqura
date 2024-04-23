package Accessspecifier2;

import Accessspecifier1.Accessspecifiereg1;

public class Accessspecifiereg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessspecifiereg1 obj=new Accessspecifiereg1();
		obj.display1();  //public outside package only public visible.
	/*	obj.display2();  // private
		obj.display3();  //protected
		obj.display4();  //default*/
    //in some cases we need to import package.
    //in some case cls also need to create public.		
	}

}
