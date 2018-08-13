package test;

public class Divisor {
	static void printDivisors(int n)
	{
		int count =0;
		for (int i=1;i<=n;i++)
			if (n%i==0) {
				count++;
				System.out.printf("%d ",i);
				System.out.println("Value of count is "+count);
			}
		if(count%2==0) {
		System.out.println("Count Value is even "+count);
		}
		else {
			System.out.println("Count value is odd");
		}
	}
	public static void main(String[] args) {
		printDivisors(10);
	}
}
