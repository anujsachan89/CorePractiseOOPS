package course;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome(707));
//System.out.println(isPalindrome(12112555));
	}
public static boolean isPalindrome(int number) {
	        int n = number;
	        int sum = 0;
	        int r;
	        while(number>0){
	        	System.out.println("Number is :"+number);
	            r = number % 10;
	            System.out.println("Value of r is: "+r);
	            sum = sum*10+r;
	            System.out.println("Sum Value = "+sum);
	            number/=10;
	            System.out.println("New value of number"+number);
	        }
	        if(number == sum){
	            return true;
	        }else {
	            return false;
	        }
	    }
}