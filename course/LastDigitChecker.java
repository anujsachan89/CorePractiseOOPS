package course;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(10, 11, 81));
	}
	public static boolean hasSameLastDigit(int a,int b,int c) {
		if(((a<=10) && (a<=1000)) || ((b<=10) && (b<=1000) || ((c<=10) && (c<=1000)))) {
	//	if((a<10 || a>1000)||(b<10 || b>1000) || (c<10 || c>1000)){		
			return false;
		}
		int d=a%10;
		int e=b%10;
		int f=c%10;
		System.out.println("a value: "+a+"B value: "+b+"C value: "+c);
		if((d==e)||(e==f)||(d==f)) {
			return true;
		}
		return false;	
	}
}
