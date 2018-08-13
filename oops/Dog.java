package oops;

public class Dog extends Animal{
	private int eye;
	private int teeth;
	private String coat;
	private int legs;
	
	
	public Dog(int eye, int teeth, String coat,int legs) {
		super(1, 1, "red");
		this.eye=eye;
		this.teeth=teeth;
		this.coat=coat;
		this.legs=legs;
	}


	@Override
	public void eat() {
		System.out.println("dog eat() called");
		//super.eat();
	}


	@Override
	public void chew() {
		System.out.println("dog chew() called");
		//super.chew();
	}


	public int getEye() {
		return eye;
	}


	public int getTeeth() {
		return teeth;
	}


	public String getCoat() {
		return coat;
	}


	public int getLegs() {
		return legs;
	}
	

}
