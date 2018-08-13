package test;

public class Stat {
String brand;
int number;
static String student = "abc";

void change() {
	student = "XYZ";
	
}
Stat(String brand1, int number1){
		brand = brand1;
		number = number1;
	}


void display() {
	System.out.println("Brand name:"+brand + "Student:"+student + "Number "+number);
}
public static void main(String[] args) {
	Stat a = new Stat("abc",8787);
	a.display();
	a.change();
	a.display();
	Stat b = new Stat("def", 789);
	b.display();
	b.change();
	b.display();
	
}

}

