package com.meritamerica.assignment1;

//string out everything into the banking app between two parties


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		//Dore
		AccountHolder DoreM = new AccountHolder(
				"Dore",
				"",
				"Mendoza",
				"999999999",
				100.0,
				1000.0);
		System.out.println(DoreM.toString());
		DoreM.getCheckingAccount().deposit(500);
		DoreM.getSavingsAccount().withdraw(800);
		System.out.println(DoreM.getCheckingAccount().toString());
		System.out.println(DoreM.getSavingsAccount().toString());
		
		//Shelby
		AccountHolder ShelbyW = new AccountHolder(
				"Shelby",
				"Eugene",
				"Walles",
				"123456789",
				200.0,
				500.0);
		System.out.println(ShelbyW.toString());
		ShelbyW.getCheckingAccount().deposit(-500);
		ShelbyW.getSavingsAccount().withdraw(600);
		System.out.println(ShelbyW.toString());
		System.out.println(ShelbyW.getCheckingAccount().toString());
		System.out.println(ShelbyW.getSavingsAccount().toString());
	}

}