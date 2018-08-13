package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrder {
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
		Arrays.sort(a);
		for(int i=n-1;i<=a.length;--i) {//length is the property of array  
			System.out.println("Sorted Array :" +a[i]);
			if(i==0) {
				System.out.println("Bhaiya break hogaya i=0 aagya");
				break;
			}
		}
	}

}
