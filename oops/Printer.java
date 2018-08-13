package oops;

public class Printer {

	private int tonnerLevel;
	private int numberOFPagesPrinted;
	private boolean isDuplexPrinter;


	public Printer(int tonnerLevel, boolean isDuplexPrinter) {
		if(tonnerLevel>-1 && tonnerLevel<=100) {
			this.tonnerLevel = tonnerLevel;
		}
		else {
			this.tonnerLevel=-1;
		}
		this.numberOFPagesPrinted = 0;
		this.isDuplexPrinter = isDuplexPrinter;
	}

	public int tonner(int tonnerAmount) {
		if(tonnerAmount>0 && tonnerAmount<=100) {
			if(this.tonnerLevel+tonnerAmount>100) {
				return -1;
			}
			this.tonnerLevel+=tonnerAmount;
			return this.tonnerLevel;
		}
		else {
			return -1;
		}
	}
}
