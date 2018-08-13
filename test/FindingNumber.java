package test;

public class FindingNumber {
	int a = 0;
	public void checkNumber(int arr[],int b) {
		for(int i=0;i<arr.length;i++) {
			if(b==arr[i]) {
				a=arr[i];
				System.out.println("Number Found is"+a);
			}
		}
		if(a==0) {
			System.out.println("Number is not found");
		}
	}
		public void deletenumber(int arr[],int b) {
			for(int i=0;i<arr.length;i++) {
				if(a==arr[i]) {
					System.out.println("Number Found is"+a);
				}
			}
			if(a==0) {
				System.out.println("Number is not found");
			}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,1,7,9,10};
		int b = 9;
		FindingNumber var = new FindingNumber();
		var.checkNumber(arr, b);
	}
}
