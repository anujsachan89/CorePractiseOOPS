package course;

public class PrimeNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=10;i<50;i++) {
			if(isPrimeNumber(i)) {
				System.out.println("Number is : "+i+"Prime Number");
				count++;
				if(count ==10) {
					System.out.println("Exiting Loop");
					break;
				}
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i<=n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
