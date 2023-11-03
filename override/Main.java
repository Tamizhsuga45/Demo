package override;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bank b1=new Bank();
          b1.loanpercentageforcurrentyear();
          Bank b2=new SBI();
          b2.loanpercentageforcurrentyear();
          Bank b3=new HDFC();
          b3.loanpercentageforcurrentyear();
          Bank b4=new ICICI();
          b4.loanpercentageforcurrentyear();
	}

}
