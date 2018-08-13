package course;

public class AllFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printFactors(6));
		//System.out.println(printFactors(32));
		//System.out.println(printFactors(10));
		printFactors(32);
		//System.out.println(printFactors(-1));
	}
		public static void printFactors(int number) {
			if(number<1) {
				System.out.println("Invalid Value");
			}
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					System.out.println(i);
				}
			}
		}
	}
