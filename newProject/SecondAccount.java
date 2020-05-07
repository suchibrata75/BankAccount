package newProject;

import java.util.Scanner;

public class SecondAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAccount obj = new NewAccount("Sabayasachi some","3666666656");
				obj.viewmenu();
				
		
	}

}

class NewAccount {
	
	int balance;
	int PreviousTransaction;
	String customerName;
	String customerId;
	
	NewAccount(String cName, String cId)
	{
		customerName = cName;
		customerId = cId;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			PreviousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			PreviousTransaction = -amount;
		}
	}
	
	void PreviousTransaction()
	{
		if(PreviousTransaction > 0)
		{
			System.out.println("deposited ="+PreviousTransaction );
		}
		else if(PreviousTransaction < 0)
		{
			System.out.println("withdrawn ="+ Math.abs(PreviousTransaction));
		}
		else {
			System.out.println("no transaction occured");
		}
	}
	
	void viewmenu()
	{
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome : " + customerName);
		System.out.println("Account No : "+ customerId);
		System.out.println("============================");
		System.out.println("\n");
		System.out.println("A. Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		System.out.println("\n");
		
		
		do {
			System.out.println("=================");
			System.out.println("enter an option : ");
			System.out.println("==================");
			option = scanner.next().charAt(0);
			System.out.println("==================");
			
			switch(option) {
				
			case 'A':
				System.out.println("$$$$$$$$$$$$$$$$$");
				System.out.println("balance ="+ balance);
				System.out.println("$$$$$$$$$$$$$$$$$");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("$$$$$$$$$$$$$$$$$");
				System.out.println("enter an amount you want to deposit");
				System.out.println("$$$$$$$$$$$$$$$$$");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("$$$$$$$$$$$$$$$$$");
				System.out.println("enter an amount you want to withdrawn");
				System.out.println("$$$$$$$$$$$$$$$$$");
				int amount1 = scanner.nextInt();
				withdraw(amount1);
				break;
				
			case 'D':
				System.out.println("$$$$$$$$$$$$$$$$$");
				PreviousTransaction();
				System.out.println("$$$$$$$$$$$$$$$$$");
				System.out.println("\n");
				
			case 'E':
				System.out.println("*****************");
				break;
				
				default:
					System.out.println("invalid option! Please try again.");
					break;
				}
		}
		while(option != 'E');
			System.out.println("thank you for using");
				
	}
	
	
}