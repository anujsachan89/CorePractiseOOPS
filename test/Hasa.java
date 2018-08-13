package test;



class Oppo{
	int n;
	int square(int n) {
		return n*n;
		
	}
}
class CIR{
	Oppo op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Oppo();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }
}

public class Hasa {
	
	
	public static void main(String[] args) {
		CIR c=new CIR();  
		   double result=c.area(5);  
		   System.out.println(result);  
		// TODO Auto-generated method stub

	}

}
