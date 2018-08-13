package course;

public class LargestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestPrime(10));
	}
	public static int getLargestPrime(int number){

        if(number < 2){
            return -1;
        }
 
        int i;
 
        for (i = 2; i <= number; i++) {
        	System.out.println("Value of loop Outside i: "+i);
            if (number % i == 0) {
                number /= i;
                System.out.println("new value of number :"+number);
                i--;
                System.out.println("decrement of i: "+i);
            }
        }
        return i;
    }
}