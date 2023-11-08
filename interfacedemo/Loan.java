package interfacedemo;

public class Loan implements Bank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("5000 amount credited to your account");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("2000 amount debited to your account");
	}
	
	public void loan() {
		System.out.println("10000 amount is due on your loan account");
}
}
