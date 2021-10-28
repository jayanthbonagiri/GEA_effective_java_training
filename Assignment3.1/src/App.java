
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(852,"pa@ss",1500);

		ATM A=new ATM();
		
		A.withdraw(852,"p@ss",1500);
		A.Deposit(852, 50000);
		
		A.changePassword("p@ss","ajay@");
		

		
		
	}

}