package course;

public class SumOfFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSum(125));
	}

	public static int isSum(int n) {
		if (n < 0){return -1;}
		 
        int first = n % 10;
        int last = 0;
 
        while(n > 0){
            last = n % 10;
            n /= 10;
        }
        return first + last;
 
    }
}
