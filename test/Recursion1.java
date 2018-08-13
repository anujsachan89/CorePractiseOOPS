package test;

public class Recursion1 {
	static int sum(int n){
		System.out.println("Vaune at starting"+n);
        if (n ==0)      
                return 0;
        else if (n<10) 
          return(sum(n+1));
        System.out.println("VAlue of N"+n);
		return n;      
  }      

public static void main(String[] args) {  
System.out.println("Factorial of 1 is: "+sum(1)); 
}
}
