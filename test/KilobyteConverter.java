package test;

public class KilobyteConverter {
	 public static Boolean Bark(Boolean barking, int hourOfDay){
		 if(hourOfDay >=23){
			 barking = true;
			System.out.println("Barking true");
			 return barking;
	      
	 }
		 else {
			 barking = false;
			 System.out.println("Barking False");
			 return barking;
		 }
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KilobyteConverter ab = new KilobyteConverter();
		ab.Bark(true,25);
	}

}
