package test;

public class CatPlaying {
	
	/*public static boolean iscatPlaying(boolean summer, int temperature) {
		if(summer == true && (temperature >= 25 && temperature <= 35)) {
			return true;
		}
		else if(summer == false && (temperature >= 25 && temperature <= 45)) {
			return true;
		}
		return false;
	}*/

		public static boolean isCatPlaying(boolean summer, int temperature)

		{

		if(summer && 25<=temperature &&temperature<=45)

		{

		return true;

		}else if(summer==false && 25<=temperature && temperature<=35)

		{

		return true;

		}

		return false;

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}

}
