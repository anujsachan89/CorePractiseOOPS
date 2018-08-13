package test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 96;
		int i =2;
		while(i<Math.sqrt(n)) {
			if(n%i==0) {
				System.out.println("N is not Prime");
				i++;
			}
		}
		System.out.println("N is Prime");
	}

}
