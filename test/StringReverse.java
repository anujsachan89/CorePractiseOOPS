package test;

public class StringReverse {
String reverse = "";

public String reverseOfString(String name) {
	if(name.length() == 1){
        return name;
    } else {
    	System.out.println("Pahela Chichora "+name.charAt(name.length()-1));
    	System.out.println("Dusra Chichora "+reverseOfString(name.substring(0,name.length()-1)));
        reverse += name.charAt(name.length()-1)
                +reverseOfString(name.substring(0,name.length()-1));
        return reverse;
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse r = new StringReverse();
		System.out.println("Result: "+r.reverseOfString("abc"));
		
	}

}
