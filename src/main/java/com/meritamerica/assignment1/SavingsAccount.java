package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class SavingsAccount {
	 
	private double balance;
	private double interestRate;
	private double FV;
	private int years;

	//sets initial balance, interest rate, and years in which interest is accrued
	public SavingsAccount (double savingsAccountOpeningBalance, int years) {
		this.balance = savingsAccountOpeningBalance;
		this.interestRate = 1.0/100;
		this.years = 3;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	//withdrawal method, subtracts withdrawal amount from balance
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("\nWithdrawn: $" + amount + "\nSavings balance: $" + balance);
			return true;
		} else {
			System.out.println("\nYou cannot withdraw $" + amount + " which is more than your balance of $" + balance);
			return false;
		}
	}
	//deposit method, adds deposit amount to balance	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("\nDeposited: $" + amount + "\nSavings balance: $" + balance);
			return true;
		} else {
			System.out.println("\nYou cannot deposit a negative amount of " + amount + " dollars.");
			return false;
		}
	}
	//calculates interest over x years
	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow((1 + interestRate), years);
		value = balance * powered;
		FV = value;
		return FV;
	}
	//turns account balance, interest, and FV to formatted String
	public String toString() {
		double FV = futureValue(years);
		DecimalFormat df = new DecimalFormat("0.##");
		return "\nSavings Account Balance: " + df.format(balance) + 
				"\n Savings Account Interest Rate: " + interestRate +
				"\n Savings Account Balance in " + years + " years: " + df.format(FV);
	}
}