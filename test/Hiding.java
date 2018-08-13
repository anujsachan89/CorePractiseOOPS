package test;


abstract class Dog{
	 Dog() {
		System.out.println("Object created for dog");
	}
	 abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  

public class Hiding extends Dog{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Hiding Class");
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Hiding();
		a.changeGear();
		a.run();
	}

}
