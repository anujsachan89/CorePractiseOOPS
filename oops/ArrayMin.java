package oops;

import java.util.Scanner;

public class ArrayMin {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		readIntegers(count);
		
	}
	public static int[] readIntegers(int count) {
		int[] array= new int [count];
			for(int i =0;i<count;i++) {
				System.out.println("Enter element #"+i);
				array[i]= sc.nextInt();
			}
		//printArray(array);
		findMin(array);
		return array;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at #"+i +"Value as: "+arr[i]);
		}
	}
	public static int findMin(int[] arr) {
		int min =arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The minimun array element in the array : "+min);
		return min;
	}
}
