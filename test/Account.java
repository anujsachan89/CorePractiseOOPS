package test;

public class Account {
int accountNumber;
String name;
float amount;
void insert(int a, String n, int acc) {
	accountNumber = acc;
	name = n;
	amount = a;
}
	void deposit(float acc) {
	amount = amount+acc;
	System.out.println("Your Deposited amount is "+acc);
	System.out.println("Balance in account is"+amount);
	}
	void withdraw(float acc) {
		if(acc>amount) {
			System.out.println("Amount nahi h bhaiya pahele jama karo");
		}
		else {
			amount=amount+acc;
			System.out.println("Your amount withdrwa is "+acc);
			System.out.println("Total amount is "+amount);
		}
	}
		void checkbalance() {
			System.out.println("Inside Check Balance Total amount"+amount);
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a = new Account();
a.insert(5000,"ANUJ", 302324);
a.deposit(6000);
a.withdraw(12000);
a.checkbalance();
System.out.println("Finished first step");
a.deposit(5000);
a.withdraw(1000);
a.checkbalance();
System.out.println("Finnished 2nd step");


	}

}
