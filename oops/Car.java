package oops;

public class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}

}
