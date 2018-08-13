package oops;

public class Vehicle {
	public int[] reverse3(int[] nums) {
	    int[] reversed = new int[nums.length];
	    System.out.println("reversed "+reversed);
	    for (int i=0; i<nums.length; i++) {
	    	System.out.println("Value of i"+i);
	    	System.out.println("Num lenght"+nums.length);
	        reversed[i] = nums[nums.length - 1 - i];
	    }
	    return reversed;
	}
	public static void main(String[] args) {
		int nums[] = {1,3,7,2,5};
		Vehicle v = new Vehicle();
		v.reverse3(nums);
	}
}
