package course;

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount =1000;
		for (int i=0;i<9;i++) {
			System.out.println("Value of Amount is 1000 and at of intrest :"+i);
			System.out.println("Calculated Intrest is"+calculateIntrest(amount, i));
		}
		System.out.println("----------------------------------------------------------");
		for (int i=9;i>0;i--) {
			System.out.println("Value of Amount is 1000 and at of intrest :"+i);
			System.out.println("Calculated Intrest is"+calculateIntrest(amount, i));
		}

	}
	public static double calculateIntrest(double amount, double intrestRate) {
		return (amount *(intrestRate/100));
	}
}
