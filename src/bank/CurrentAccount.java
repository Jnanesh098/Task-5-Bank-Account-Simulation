package bank;

public class CurrentAccount extends Account 
{
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit)
	{
		super(accountNumber, holderName, initialBalance);
		this.overdraftLimit= overdraftLimit;
	}
	@Override
	public void withdraw(double amount)
	{
		if(amount>0 &&(getBalance()+overdraftLimit)>=amount)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("overdraft Limit exceeded or invalid amount");
		}
	}
}