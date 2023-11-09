package loosecoupling;

public class Gift implements Exam {
	
		private Exam e;
		Gift(Exam e){
			this.e=e;
		}
		public void gift() {
			e.gift();
		}
	}


