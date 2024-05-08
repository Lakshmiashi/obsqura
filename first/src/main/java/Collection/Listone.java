package Collection;
import java.util.*;
public class Listone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> obj=new ArrayList<String>();
		obj.add("Lakshmi");
		obj.add("Ashi");
		obj.add("aparna");
		obj.add("Lakshmi");
		obj.set(1, "hai");  //set used to replace.
		int a=obj.indexOf("Lakshmi"); //in which index occur first.
	    int b=obj.lastIndexOf("Lakshmi");
		
		
		System.out.println(a);
		System.out.println(b);
		obj.remove("hai");
		System.out.println(obj);
		System.out.println(obj.get(1));  //index value 2 get
		boolean n=obj.contains("aparna"); //the element exist or not true or false value get.
		System.out.println(n);
	
	}

}
