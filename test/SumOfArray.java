package test;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		int sum =0;
		for (int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			sum+= a[i];
		}
		System.out.println("sum is : "+sum);
	}
}
