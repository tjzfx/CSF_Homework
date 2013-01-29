package com.generalassembly;

public class BankAccountUnsafe {
	private float balance;

	public BankAccountUnsafe(float initialBalance)
	{
		balance = initialBalance;
	}
	
	public void Withdraw(float amount) {
		balance -= amount;
	}
	
	public void Deposit(float amount) {
		balance += amount;
	}
	
	public static void Transfer(BankAccount fromAccount, BankAccount toAccount, float amount)
	{
		synchronized(fromAccount) {
			synchronized(toAccount) {
				fromAccount.Withdraw(amount);
				toAccount.Deposit(amount);
			}
		}
	}
}

