package course;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}
	public static boolean hasSharedDigit(int num1,int num2) {
		if(((num1<10) && (num1<99)) || ((num2<10) && (num2<99))) {
			return false;
		}
		int firstNumber1 = num1/10;
		System.out.println("First Number of num1: "+firstNumber1);
		int lastNumber1 =num1%10;
		System.out.println("Last Number of num1: "+lastNumber1);
		int secondfirstNumber1 =num2/10;
		System.out.println("First Number of num2: "+secondfirstNumber1);
		int secondlastNumber1 =num2%10;
		System.out.println("Last Number of num2: "+secondlastNumber1);
		
		if(((firstNumber1==secondfirstNumber1 ||firstNumber1==secondlastNumber1) ||((lastNumber1==secondfirstNumber1)||(lastNumber1==secondlastNumber1)))){
			return true;
		}
		return false;
	}
}
