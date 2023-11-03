package superclass;

public class Student extends Person {
	
	    String name ="Tamizh";
	    String course = "Java";

	    Student(){
	        super();
	
	    }

	    public void msg(){
	        System.out.println(name + " " + course);
	    } 
	    public void display()
	    {
	    	super.display();
	    }
	
	    
}
