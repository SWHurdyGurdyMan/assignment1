package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args){
        AccountHolder accountHolder = new AccountHolder(
            	"Sadiq",
            	"",
            	"Manji",
            	"123456789",
            	100,
            	1000);
        System.out.println(accountHolder.toString());
        SavingsAccount.deposit(500);
        SavingsAccount.withdraw(800);
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());
        AccountHolder newAccountHolder = new AccountHolder(
            	"Sadiq",
            	"",
            	"Manji",
            	"123456789",
            	200,
            	500);
        CheckingAccount.deposit(-500);
        SavingsAccount.withdraw(600);
        System.out.println(newAccountHolder.toString());
	}
}