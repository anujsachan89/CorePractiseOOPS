package test;

public class Employee {
String name;
int id;
Address address;
public void employeeDetails(String name, int id, Address address) {
	name = this.name;
	id = this.id;
	address = this.address;
}
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.name+" "+address.country);  
		}  
}

