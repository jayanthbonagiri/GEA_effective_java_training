
public class BankApp {


	public static void main(String[] args) {
		Atm SBIhyd = new Atm();
		SBIhyd.ba1.show();
		SBIhyd.ba1.deposit(200000);
		SBIhyd.ba1.creditInterest();
		SBIhyd.ba1.withdraw(500,"pass");
		SBIhyd.ba1.changePassword("pass","new@pass");
		SBIhyd.ba1.show();		
	}



}
