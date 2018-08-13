package oops;

public class BankAccount {
	private String customerName;
	private int accountNumber;
	private int balance;
	private int phoneNumber;
	private String email;
	
	
	public void depositAmount(int amount) {
		System.out.println("You have total: "+this.balance+" in your account");
		this.balance+= amount;
		System.out.println("Amount deposited : "+amount+" Updated Balance is: "+this.balance);
	}
	public void withdrawlAmount(int amount) {
		if(this.balance>=amount) {
		System.out.println("Available Balance : "+this.balance);
		System.out.println("Amount withdrwan: "+amount);
		this.balance-=amount;
		System.out.println("New Balance in account: "+this.balance);
	}
		else {
			System.out.println("You don't have sufficient amount in your account");
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
