package oops;

class Automobile{
	private boolean engine;
	private int cylinder;
	private int wheels;
	private String name;

	public Automobile(int cylinder, String name) {
		this.engine = true;
		this.cylinder = cylinder;
		this.wheels = 4;
		this.name=name;
	}

	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return "Car -> Start Engine()";
	}
	public String accelarate() {
		return "Car->Accelerated";
	}
	public String breakApplied() {
		return "car -> break";
	}
}

class Mistubushi extends Automobile{

	public Mistubushi(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String accelarate() {
		// TODO Auto-generated method stub
		return "Mistubushi -> accelarate Engine()";
	}

	@Override
	public String breakApplied() {
		// TODO Auto-generated method stub
		return "Mistubushi -> breakApplied Engine()";
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Mistubushi -> Start Engine()";
	}

}

public class Polymorphism {
	public static void main(String[] args) {
		Automobile car = new Automobile(5,"Base Car");
		System.out.println(car.startEngine());
		System.out.println(car.accelarate());
		System.out.println(car.breakApplied());
		Mistubushi mu = new Mistubushi(8, "Mistubashu");
		System.out.println(mu.accelarate());
		System.out.println(mu.breakApplied());
		System.out.println(mu.startEngine());
	}
}
