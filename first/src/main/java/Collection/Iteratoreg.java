package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colors=new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
      Iterator<String> it=colors.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      it.remove();
      System.out.println(colors);

	}

}
