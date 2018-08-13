package test;

public class MethodOver {
	public static void getDurationString(int minutes,int seconds) {
		if(((minutes>=0) && (seconds>=0) && (seconds <=59))) {
			int hour = minutes/60;
			int hourInMinutes = hour%60;
			int oneMinute = seconds%3600;
			System.out.println("Hour in minutes"+hourInMinutes);
			System.out.println("Hour: "+hour+" Minute : "+oneMinute);
		}
		else {
			System.out.println("Invalid Value");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDurationString(75, 54);
	}

}
