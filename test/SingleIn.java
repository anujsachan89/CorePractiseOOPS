package test;

class In {
float salary = 10000;

void cal1() {
	System.out.println("inside singlein");
}

}
class Sing extends In{
float bonus=1000;
void cal2() {
	System.out.println("inside Sing");
}
}
	class SingleIn{
public static void main(String[] args) {
	Sing v = new Sing();
	v.cal1();
	v.cal2();
}	
}
