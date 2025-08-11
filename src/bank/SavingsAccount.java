package bank;

public class SavingsAccount extends Account 
{
	private double interestRate;
	public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate)
	{
		super(accountNumber, holderName, initialBalance);
		this.interestRate= interestRate;
	}
	public void addinterest()
	{
		double interest= getBalance()*interestRate/100;
		deposit(interest);
		System.out.println("Interest added:"+interest);
	}
}
