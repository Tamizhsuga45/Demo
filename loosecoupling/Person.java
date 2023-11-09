package loosecoupling;

public class Person {

	public static void main(String[] args) {
		Exam b=new Bike();
		Exam c=new Cycle();
		Gift g=new Gift(c);
		g.gift();
	}

}
