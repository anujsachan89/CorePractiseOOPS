package course;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the number count: ");
		int[] array = {1,2,3,4,6};
		//int count = sc.nextInt();
		reverseArray(array);
		System.out.println(Arrays.toString(array));
	}
	public static int[] readIntegers(int count) {
		int[] array= new int [count];
			for(int i =0;i<count;i++) {
				System.out.println("Enter element #"+i);
				array[i]= sc.nextInt();
			}
			reverseArray(array);
		return array;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at #"+i +"Value as: "+arr[i]);
		}
	}
	public static void reverseArray(int[] array) {
		int maxIndex = array.length-1;
		int halfIndex = array.length/2;
		
		for(int i=0;i<halfIndex;i++) {
			int temp = array[i];
			array[i] = array[maxIndex-i];
			array[maxIndex-i] = temp;
		}
	}
}
