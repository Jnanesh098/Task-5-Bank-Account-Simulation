package bank;

import java.util.ArrayList;
import java.util.List;

public class Account 
{
	private String accountNumber;
	private String holderName;
	private double balance;
	private List<String>transactions;
	
	public Account(String accountNumber, String holderName, double initialBalance)
	{
		this.accountNumber= accountNumber;
		this.holderName= holderName;
		this.balance= initialBalance;
		this.transactions= new ArrayList<>();
		
		transactions.add("Account created with balance:"+initialBalance);
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public String getHolderName()
	{
		return holderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			transactions.add("Deposit:"+ amount);
			System.out.println("Deposit:"+ amount);
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println(" Withdrawn: " + amount);
        }
        else 
        {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public void printTransactions()
	{
		System.out.println("Transaction History:");
		for(String t: transactions)
		{
			System.out.println(t);
		}
	}
}