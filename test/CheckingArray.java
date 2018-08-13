package test;

import java.util.Arrays;

public class CheckingArray {
	public static void main(String[] args) {
	int arr[] = {1,4,6,7,8};
	int abc[] = {5,9,7,9};
    System.out.println("Is array 1 equal to array 2?? " +Arrays.equals(arr, abc));
	if(arr.length == abc.length) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			for(int j=0;j<abc.length;j++) {
				if(arr[i]== abc[j]) {
					System.out.println("Values are equal at i :"+i +"Values are equal at j :"+j);
				}
				System.out.println(abc[j]);
			}
		}
		
	}
	else {
		System.out.println("Arrays are not same");
	}
}
}

