package course;

public class DayOfTheWeek {
	public static int printDayOfTheWeek(int number) {
		if(number<10) {
			return -1;
		}
		int sum =0;
		while(number>0) {
			//extract the least significant Digit
			int digit = number%10;
			sum+=digit;
			
			//drop the least significant digit
			number/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printDayOfTheWeek(1));
	}

}
