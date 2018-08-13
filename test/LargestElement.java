package test;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter no. of elements");
				int n = sc.nextInt();
				System.out.println("Enter elements");
				int a[]=new int[n];
				int max =a[0];
				for (int i=0;i<n;i++) {
					a[i]= sc.nextInt();
				}
				for (int i=1;i<n;i++) {
					if(max<a[i]) {
						max=a[i];
					}
				}
				System.out.println(max);
				for(int j=0;j<=a.length;j++) {//length is the property of array  
						System.out.println("Sorted Array :" +a[j]);
						System.out.println("Max Element "+max);
				}
	
	}
}
