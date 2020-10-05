//Authors: Shelby Walles and Dore Mendoza
package com.meritamerica.assignment1;

public class AccountHolder {
	public AccountHolder(String firstName, String middleName, String lastName, 
			String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance){
		System.out.println("Name: " + firstName + " " + middleName + " " + lastName );
		System.out.println("SSN: " + ssn);
		System.out.println("Checking Account Balance: " + checkingAccountOpeningBalance);
		System.out.println("Checking Account Interest Rate: 0.0001");
		System.out.println("Checking Account Balance in 3 years: " + checkingAccountOpeningBalance);
		System.out.println("Savings Account Balance: " + savingsAccountOpeningBalance);
		System.out.println("Savings Account Interest Rate: 0.01");
		System.out.println("Savings Account Balance in 3 years: " + savingsAccountOpeningBalance);
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
		return checkingaccountBalance;
	}
	public SavingsAccount getSavingsAccount() {
		return savingsaccountBalance;
	}
	public String toString(){
		return string;
	}
	//establishes Instance Variables
	private static String firstName;
	private static String middleName;
	private static String lastName;
	private static String ssn;
	private static double checkingAccountOpeningBalance;
	private static double savingsAccountOpeningBalance;
}