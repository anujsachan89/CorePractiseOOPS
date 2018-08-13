package course;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));*/
		System.out.println(sumOdd(10, 5));
	}
	public static boolean isOdd(int number){
		if(number%2!=0){
			return true;
		}
		return false;
	}
	public static int sumOdd(int start, int end){
		if((start>0) && (end >start)) {
			System.out.println("Inside Validation");
			return -1;
		}
		else {
			System.out.println("1");
			int sum=0;
			System.out.println("2");
			for(int i = start;i<=end;i++) {
				System.out.println("3");
				if(isOdd(i)) {
					System.out.println("4");
					sum+=i;
					System.out.println(+sum);
				}
			}
			return sum;
		}
	}
}

