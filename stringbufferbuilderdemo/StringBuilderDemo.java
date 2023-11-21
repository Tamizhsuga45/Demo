package stringbufferbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("how are you");
		 s.reverse();
		 
			// delete(starting index , end index)//
	        s.delete(0, 3);
	         System.out.println(s);
	         // deletecharAt()
	         s.deleteCharAt(3);
	         System.out.println(s);
	         StringBuilder b= new StringBuilder("All is well ");
				b.replace(0,1, "i");
				System.out.println(b);
		 
		 StringBuilder s1 = new StringBuilder("hello");
			s1.insert(5, "hello");
			System.out.println(s1);
			
	}

}
