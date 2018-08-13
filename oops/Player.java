package oops;

public class Player {

	private int age;
	private int health=100;
	private String name;
	public Player(int age, int health, String name) {
		this.age = age;
		if(health>0 && health<=100) {
			this.health = health;
		}
		this.name = name;
	}
	public void looseHealth(int damage) {
		this.health= this.health -damage;
		if(this.health<=0) {
			System.out.println("Player knocked out");
		}
	}
	public int getHealth() {
		return health;
	}
}
