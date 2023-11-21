package stringbufferbuilderdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("how are you");
		s.append("world");
		System.out.println(s);
		 s.reverse();
		 System.out.println(s);
			
		
		//insert method
		StringBuffer sb1=new StringBuffer("Hi");
		sb1.insert(2, "welcome");
		System.out.println(sb1);
		// delete(starting index , end index)//
		 s.delete(0, 3);
         System.out.println(s);
         // deletecharAt()
         s.deleteCharAt(5);
         System.out.println(s);
         StringBuffer b= new StringBuffer("All is well ");
 		  b.replace(0,1, "i");
 		  System.out.println(b);
	}

}
