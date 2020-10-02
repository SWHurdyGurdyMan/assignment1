//Authors: Shelby Walles and Dore Mendoza
package com.meritamerica.assignment1;

public class AccountHolder {
	public AccountHolder(String firstName, String middleName, String lastName, 
			String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		System.out.println("Name: " + firstName + " " + middleName + " " + lastName );
		System.out.println("SSN: " + ssn);
		System.out.println("Checking Account Balance: " + checkingAccountOpeningBalance);
		System.out.println("Checking Account Interest Rate: ");
		System.out.println("Checking Account Balance in 3 years: ");
		System.out.println("Savings Account Balance: " + savingsAccountOpeningBalance);
		System.out.println("Savings Account Interest Rate: ");
		System.out.println("Savings Account Balance in 3 years: ");
	}
	public static void main(String[] args) {
		
	}
	//returns current firstName
	public String getFirstName() {
		return firstName;
	}
	//sets String firstName to a new first name, calls firstName AccountHolder constructor
	public void setFirstName(String firstName) {
	}
	//returns current middleName
	public String getMiddleName() {
		return middleName;
	}
	//sets String firstName to a new middle name, calls middleName AccountHolder constructor
	public void setMiddleName(String middleName) {
	}
	//returns current lastName
	public String getLastName() {
		return lastName;
	}
	//sets String firstName to a new middle name, calls middleName AccountHolder constructor
	public void setLastName(String lastName) {
	}
	public String getSSN() {
		return ssn;
	}
	//sets String firstName to a new middle name, calls middleName AccountHolder constructor
	public void setSNN(String snn) {
	}
	public CheckingAccount getCheckingAccount() {
		
	}
	public SavingsAccount getSavingsAccount() {
		
	}
	//establishes Instance Variables
	public static String firstName = "Shelby";
	public static String middleName = "Eugene";
	public static String lastName = "Walles";
	public static String ssn = "123-45-6789";
	public static double checkingAccountOpeningBalance = 100;
	public static double savingsAccountOpeningBalance = 1000;
}