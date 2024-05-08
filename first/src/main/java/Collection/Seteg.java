package Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Seteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> obj=new LinkedHashSet<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj);
		
		
		Set obj2=new LinkedHashSet();
		obj2.add(6);
		obj2.add(9);
		System.out.println(obj2);
		
		obj.addAll(obj2);
		System.out.println(obj);
		
		obj.clear(); //to clear
		System.out.println(obj);
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj);
		
		System.out.println(obj.contains(4));
		System.out.println(obj.isEmpty());
		System.out.println(obj.hashCode());
		
		
		obj.remove(3);
		System.out.println(obj);
		
		obj.removeAll(obj);
		System.out.println(obj);
		
		
		Set obj3=new  HashSet();
		
		
		obj3.add(8);
		obj3.add(10);
		
		obj.retainAll(obj3);System.out.println(obj3);
	}

}
