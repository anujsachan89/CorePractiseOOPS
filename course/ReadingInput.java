package course;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter =0;
		int sum=0;
		while(counter<10) {
			int order = counter+1;
			System.out.println("Enter number #"+order+":");
			boolean isAnInt = sc.hasNextInt();
			
			if(isAnInt) {
				int number = sc.nextInt();
				counter++;
				sum+=number;
			}
			else {
				System.out.println("Invalid Number");
			}
			sc.nextLine();//handle end of line
		}
		System.out.println("Sum is:"+sum);
		sc.close();
	}
}
