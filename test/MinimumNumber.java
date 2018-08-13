package test;

public class MinimumNumber {

	static void getMinimum(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) { 
			if(min>arr[i]) { 
				min=arr[i];
				System.out.println(min);
			}
		}
		System.out.println("Minimum array is: "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,5,3,2,6,10};
		getMinimum(arr);
	}

}
