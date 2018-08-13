package course;

import java.util.Scanner;

public class ArrayChallenge {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] arr= {9,4,8,1,0};
		sortArray(arr);



	}
	public static int[] getIntegers(int number) {
		int values[] = new int[number];
		System.out.println("Enter #"+number +"Values");
		for(int i=0;i<number;i++) {
			values[i]=sc.nextInt();
		}
		return values;
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Array entered in location#"+i+" Value are :"+array[i]);
		}
	}
	public static void sortArray(int[]  arr) {
		int [] duplicate = new int [arr.length];
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				duplicate[i] =temp;
				System.out.println(arr[i]);
			}
			else {
				duplicate[i] =arr[i];
			}
		}
		printArray(duplicate);
	}
}
