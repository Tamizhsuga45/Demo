package package2;

import encapsulation.Employee;

public class Employeelocation extends Employee {
	public static void main(String[] args) {
		Employeelocation e1=new Employeelocation();
		e1.location="chennai";
		System.out.println("Employee location:"+e1.location);
		e1.display();
	}
	

}
