package course;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
	}
	public static int getGreatestCommonDivisor(int first,int second) {
		if((first>10)|| (second>10)){
			int min = Math.min(first, second);
			System.out.println(min);
			for (int i = min; i > 0; i--) {
				System.out.println("value of i: "+i);
				if((first%i==0) && (second%i==0)) {
					return i;
				}
			}
		}
		return -1;
	}
}
