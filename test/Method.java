package test;

public class Method {
	public static void displayHighScore(String playerName, int position) {
		System.out.println(playerName+"managed to get in the position"+ position+"on the high score table");
	}
	
	public static int calculateHighScorePosiition(int playerScore) {
		if(playerScore>=1000) {
			return 1;
		}
		else if(playerScore>500 && playerScore<1000) {
			return 2;
		}
		else if(playerScore>100 && playerScore<500) {
			return 3;
		}
		return 4;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = calculateHighScorePosiition(1500);
		displayHighScore("Anuj", num);
		
		num = calculateHighScorePosiition(900);
		displayHighScore("BOB", num);
		
		num = calculateHighScorePosiition(400);
		displayHighScore("NAMO", num);
		
		num = calculateHighScorePosiition(50);
		displayHighScore("YAHOO", num);
	
	}
}
