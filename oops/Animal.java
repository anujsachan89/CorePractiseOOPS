package oops;

public class Animal {
	private int size;
	private int weight;
	private String colour;
	public Animal(int size, int weight, String colour) {
		this.size = size;
		this.weight = weight;
		this.colour = colour;
	}
	public void eat() {
		System.out.println("Animal eat() called");
	}
	public void chew() {
		System.out.println("Animal chew() called");
	}
	public int getSize() {
		return size;
	}
	public int getWeight() {
		return weight;
	}
	public String getColour() {
		return colour;
	}
}
