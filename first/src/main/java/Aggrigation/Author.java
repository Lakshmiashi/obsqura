package Aggrigation;

public class Author {
           String a_name;
           String place;
           Book b;
           public Author(String a_name,String place,Book b)
           {
        	   this.a_name=a_name;
        	   this.place=place;
        	   this.b=b;
           }
           public void display() 
           {
        	   System.out.println(b.name+" "+b.age);
        	   System.out.println(a_name+" "+place);
           }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book c=new Book("hello",10);
		Author a=new Author("gini","Tvm",c);
		a.display();

	}

}
