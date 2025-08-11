package bank;

import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		SavingsAccount sa=new SavingsAccount("s123", "sai", 50000,5);
		CurrentAccount ca=new CurrentAccount("c456", "Jnanesh", 20000,10000);
		
		while(true)
		{
			System.out.println("-------Bank Account Menu--------");
			System.out.println("1. Deposit(savings)");
			System.out.println("2. Withdraw(savings)");
			System.out.println("3. Add interest(savings)");
			System.out.println("4. Deposit(current)");
			System.out.println("5. withdraw(current)");
			System.out.println("6. View Transactions");
			System.out.println("7. Exit");
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				System.out.println("Enter amount:");
				sa.deposit(sc.nextDouble());
			}
			case 2->{
				System.out.println("Enter amount:");
				sa.withdraw(sc.nextDouble());
			}
			case 3-> sa.addinterest();
			case 4->{
				System.out.println("Enter amount:");
				ca.deposit(sc.nextDouble());
			}
			case 5->{
				System.out.println("Enter amount:");
				ca.withdraw(sc.nextDouble());
			}
			case 6->{
				sa.printTransactions();
				ca.printTransactions();
			}
			case 7->{
				System.out.println("Exiting....");
		        sc.close();
		        return;
	        }
	        default->System.out.println("Invalid choice");
			}
		}
	}
}
