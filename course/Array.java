package course;

import java.util.Scanner;

public class Array {
	public static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) {
		int [] array = getArray(5);
		for (int i=0;i<array.length;i++) {
			System.out.println("Value of i: "+i+" Elements typed is: "+array[i]);
		}
		System.out.println("The average sum of all the elemnts of the array:"+sumOfArray(array));
	}
	public static int[] getArray(int number) {
		System.out.println("Enter" +number+" number");
		int [] values = new int [number];
		for(int i=0;i<number;i++) {
			values[i]=scanner.nextInt();
		}
		return values;
	}
	
	public static double sumOfArray(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum /(double) array.length;
	}

}
