package test;

public class DayOfTheWeek {
public static void printDayOfTheweek(int day) {
	switch(day) {
	case 0:
		System.out.println("Sunday");
		break;
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thrusday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Invalid Day");
		break;
	}
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDayOfTheweek(0);
		printDayOfTheweek(1);
		printDayOfTheweek(2);
		printDayOfTheweek(3);
		printDayOfTheweek(4);
		printDayOfTheweek(5);
		printDayOfTheweek(6);
		printDayOfTheweek(7);
	}

}
