package course;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		
	}
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return -1;
		}
		int sum=0;
		while(number>0) {
			int first = number%10;
			if(first%2==0) {
				sum+=first;
			}
			number/=10;
		}
		return sum;
	}
}
