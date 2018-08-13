package test;

public class GeekforGeek {

	int findingNumber(int d, int n) {
		int c=0;
		while(n>0) {
			if(n%10 ==d) {
				c++;
				
			}
			n = n/10;
		}
		return c;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 8;
		int n = 81283498;
		GeekforGeek g = new GeekforGeek();
		int count = g.findingNumber(d, n);
		System.out.println("Count is"+count);
	}

}
