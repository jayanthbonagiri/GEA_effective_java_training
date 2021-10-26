import java.util.Scanner;

public class Bank_Account {
	private long Account_Number;
	private String Name;
	private String Password;
	private long Balance;
	private int Interest_Rate;
	Scanner scan=new Scanner(System.in);
	public void Create_Account()
	{
		
		System.out.println("Enter The Bank Account Number :");
		Account_Number=scan.nextLong();
		System.out.println("Enter The Name of the Person :");
		Name=scan.next();
		System.out.println("Enter The Password :");
		Password=scan.next();
		System.out.println("Enter The Balance Amount :");
		Balance=scan.nextLong();
		System.out.println("Enter The Interest Rate Of Your Choice :");
		Interest_Rate=scan.nextInt();
		
	}
		
	public void Deposit()
	{
		System.out.println("Enter the Account number to deposit");
		long acc=scan.nextLong();
		if(Account_Number==acc)
		{
			System.out.println("Enter the amount to be deposit :");
			long Amount=scan.nextLong();
			
			if(Amount<=0)
			{
				System.out.println("The Amount which you have Entered is Less Than Zero.Please enter some other Amount!!!");
			}
			else
			{
				System.out.println("Successfully deposited " +(Balance+Amount)+" rupees");
			}
		}
		else
		{
			System.out.println("Invalid Field!!!!");
		}
		
	}
	
	public void Withdraw()
	{
		
		String psw;
		
		System.out.println("Enter the password :");
		psw=scan.next();
		if(Password.equals(psw))
		{
			System.out.println("Enter the amount to be withdraw :");
			long Amount=scan.nextLong();
			if(Amount<=0)
			{
				System.out.println("Withdraw Amount is less .Please withdraw some other Amount!!!");
			}
			else if(Amount>Balance)
			{
				System.out.println("Less Balance..Please withdraw some other Amount!!!");
			}
			else 
			{
				System.out.println("Successfully withdraw!! Available balance is " +(Balance-Amount)+" rupees");
			}
			
		}
		else
		{
			System.out.println("Invalid Password!!!!");
		}
		
		
	}
	public void Credit_Interest()
	{
		Balance=(Balance*Interest_Rate/1200);
		System.out.println("Credited Interest is :"+Balance);
	
	}
	
	public static void main(String[] args)
	{
		Bank_Account ba=new Bank_Account();
		
		
		
		Scanner scan=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n 1:Create Account\n 2:Deposit Amount\n 3:Withdraw Amount\n 4:Credit Interest\n");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				ba.Create_Account();
				break;
			
			case 2:
				ba.Deposit();
				break;
				
			case 3:
				ba.Withdraw();
				break;
			
			case 4:
				ba.Credit_Interest();
				break;
				
			case 5:
				
				break;
			}
		}
		while(ch!=5);
		
		
	}
		
	
}