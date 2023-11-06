package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee x=new Employee();
		x.name="Tamizh";
		x.deptname="java";
		x.location="chennai";
		x.setEmpid(1234);
		System.out.println(x.name);
		System.out.println(x.deptname);
		System.out.println(x.location);
		System.out.println(x.getEmpid());

	}

}
