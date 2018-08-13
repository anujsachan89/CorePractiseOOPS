package oops;

public class AnimalMain {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		Animal animal = new Animal(1, 50, "orange");
		System.out.println(animal.getColour()+animal.getSize()+animal.getWeight());
		Dog dog = new Dog(2, 32, "Yahoo", 4);
		System.out.println("aaaa");
		dog.chew();
		dog.eat();*/
		Car car = new Car("BWM");
		System.out.println(car.getName());
		car.getName();
		Car car1 = new Car("yahoo");
		car1.getName();
		car1 = car;
		car1.getName();
		car.getName();
		
	}

}
