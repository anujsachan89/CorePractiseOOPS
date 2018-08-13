package test;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		for (int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Enter elements u want to search");
		int s = sc.nextInt();
		System.out.println();
		for(int i=0;i<=a.length-1;i++) {//length is the property of array  
			if(s==a[i]) {
				System.out.println("Found element in the positon"+i);
			}
		}
		System.out.println("not found");
	}
}

