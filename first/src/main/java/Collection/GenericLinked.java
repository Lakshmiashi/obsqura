package Collection;

import java.util.LinkedList;

public class GenericLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      LinkedList obj=new LinkedList();
	      obj.add("Lakshmi");
	      obj.add("Ashi");
	      obj.add("Ratheesh");
	      obj.add("Abi");
	      obj.add("Ishan");
	      System.out.println(obj);
	      
	      obj.add(1,"sreya");
	      System.out.println(obj);
	      
	      obj.addFirst("Swathi");
	      obj.addLast("Aparna");
	      System.out.println(obj);
	      obj.remove("Abi");
	      System.out.println(obj);
	      
	      LinkedList obj1=new LinkedList();
	      obj1.add("chippy");
	      obj1.add("Chinnu");
	      obj.addAll(obj1);
	      System.out.println(obj);
	      obj.removeAll(obj1);
	      System.out.println(obj);
	      
	      obj.removeFirst();
	      System.out.println(obj);
	      
	      
	      obj.removeLast();
	      System.out.println(obj);
	      
	      Boolean x=obj.contains("Ashi");
	      System.out.println(x);
	      System.out.println(obj.get(1));
	      
	      
	}

}
