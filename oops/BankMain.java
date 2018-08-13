package oops;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VipCustomer person = new VipCustomer();
		System.out.println(person.getName());
		VipCustomer person2 = new VipCustomer("bob",3000);
		System.out.println(person2.getName());
		
		VipCustomer person3 = new VipCustomer("tim",3000,"anuj@gmail.com");
		System.out.println(person3.getName());
		
	}

}
