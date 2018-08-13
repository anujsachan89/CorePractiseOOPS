package test;

public class Frequencyofdigit {
	int frequencyDigits(int n, int d)
	{   
	    // Counter variable to store
	    // the frequency
	    int c = 0;
	     
	    // iterate till number reduces to zero
	    while (n > 0) {
	         System.out.println("N vaue:"+n);
	        // check for equality
	        if (n % 10 == d)
	            c++;
	        System.out.println("Inside if block n value"+n);
	        // reduce the number
	        n = n / 10;
	    }
	     
	    return c;
	}
	
	public static void main(String[] args) {

		int N = 1122322;
	     
	    // input digit D
	    int D = 2;
	    
	    Frequencyofdigit a = new Frequencyofdigit();
	    int count = a.frequencyDigits(N, D);
	    System.out.println("Count: "+count);
		
		
		
	}
}