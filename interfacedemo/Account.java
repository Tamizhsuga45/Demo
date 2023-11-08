package interfacedemo;

public class Account implements Bank {

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

}
