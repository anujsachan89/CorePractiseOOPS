package test;

public class Constructor {
int number;
String name;
static String college= "abc";
Constructor(int number, String batch){
	number = number;
	name = batch;
	System.out.println("name"+name +"number:"+number +"College:"+college);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor(1235, "BTECH");
		
	}

}
