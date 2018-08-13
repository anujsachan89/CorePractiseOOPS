package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "anuj";
		String s2 = "anuj";
		String s3 = new String("anuj");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}

}
