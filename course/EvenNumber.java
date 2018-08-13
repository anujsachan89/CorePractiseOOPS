package course;

public class EvenNumber {
	public static void main(String[] args) {
		int start=2;
		int end =42;
		int count =0;
		while(start<=end) {
			start++;
			if(!isValid(start)) {
				continue;
			}
			count++;
			System.out.println("Even Number : "+start);
			if(count==10) {
				System.out.println("Value of count is : "+count);
				break;
			}
		}
		System.out.println("total number of even numbers"+count);
	}
	public static boolean isValid(int number) {
		if(number%2==0) {
			return true;
		}
		return false;
	}
}
