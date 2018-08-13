package course;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(1234454);
	}
	public static void reverseNumber(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		int reversed = 0;

        while(number != 0) {
            int digit = number % 10;
            //System.out.println("Digit Value is "+digit);
            reversed = reversed * 10 + digit;
            //System.out.println("Reverse value is : "+reversed);
            number /= 10;
        }

        //System.out.println("Reversed Number: " + reversed);
        numberCount(reversed);
    }
			
	public static void numberCount(int number) {
		while(number>0) {
			int lastDigit = number%10;
			//System.out.println("Last digit: "+lastDigit);
			isNumber(lastDigit);
			number /=10;
		}
	}
	public static void isNumber(int number) {
		switch(number) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		case 0:
			System.out.println("ZERO");
			break;
		default: 
			System.out.println("Nothing is there");
			break;

		}
	}
}
