package course;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPerftnumber(6));
		System.out.println(isPerfectNumber(28));
		//System.out.println(isPerftnumber(5));
		//System.out.println(isPerftnumber(-1));

	}
	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		if (number < 1) {
			return false;
		}
		for ( int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum!=number){
			return false;
		}
		return true;
	}
}