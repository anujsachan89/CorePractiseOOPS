package oops;

public class PlayerMain {
	public static void main(String[] args) {
		Player player = new Player(12, 200, "tim");
		System.out.println("Initial Health is : "+player.getHealth());
	}
}
