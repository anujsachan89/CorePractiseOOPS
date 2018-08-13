package test;

public class AreaCalculator {
	public static double area(double radius){
		double pi = 3.14159;
		if(radius==-1) {
			return -1;
		}
		double area;
		area = radius*radius*pi;
		return area;
	}
	public static double area(double x, double y) {
		if(x<0 || y<0) {
			return -1;
		}
		double area;
		area = x*y;
		return area;
		
	}
	public static void main(String[] args) {
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0,4.0));
		System.out.println(area(-1,4.0));
		
	}
	

}
