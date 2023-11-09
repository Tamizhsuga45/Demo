package loosecoupling1;

public class Person {

	public static void main(String[] args) {
		Transport b=new Bus();
		Transport t=new Train();
		Itravel t1=new Travel(t);
		t1.show();

	}

}
