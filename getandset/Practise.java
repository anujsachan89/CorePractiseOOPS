package getandset;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AUSTIN TEXAS";
		//methodString(str);
		Practise p = new Practise();
		p.methodString(str);
	}
	public  String methodString(String str) {
		if((null ==str) || (str.length()<=1)){
			System.out.println("1");
			return str;
		}
		System.out.println("2");
		return methodString(str.substring(1)+str.charAt(0));
	}

}
