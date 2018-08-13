package course;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =10;
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i =1;i<=number;i++) {
			System.out.println("Enter Number #"+i);
			 sum+= sc.nextInt();
		}
		System.out.println("Sum is :"+sum);

	}

}
