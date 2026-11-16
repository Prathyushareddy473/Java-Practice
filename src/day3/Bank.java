package day3;

public class Bank {
	private String User;
	private double AccountNo;
	public void setUser(String User) {
		this.User=User;
	}
		public String getUser() {
			return User;
			
		}
		public void setAccountNo(double AccountNo) {
			this.AccountNo=AccountNo;
		}	
		public double getAccounNo() {
			return AccountNo;
		
		}
	

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setUser("prathyu");
		b.setAccountNo(7484930);
		System.out.println(b.getUser());
		System.out.println(b.getAccounNo());
				
	

	}

}

