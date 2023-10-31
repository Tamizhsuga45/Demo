package oops;

class Bank{
	   String bname;
	   String loc;
	   double regno;
	   Bank(String a, String b, double c) 
	   {
	        bname=a;
	         loc =b;
	         regno = c;
	    }
	}
public class Main2{

    public static void main(String[] args) {
        Bank b= new Bank ("state bank" , "chennai", 600023);
  	    System.out.println("bank:"+b.bname) ;
  	    System.out.println("loc:"+b.loc) ;
    	System.out.println("regno:"+b.regno); 
    }
}