package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatNumber {
	public static int repeatedNumber(final List<Integer> a) {
		int num=0;
		for (int i = 0; i < a.size()-1; i++) {
			for (int k = i+1; k < a.size(); k++) {
				
				if(a.get(i) == a.get(k)) {
					
					num = a.get(i);
					System.out.println(num);
					return num;
				}
			}
			return -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(1, 8, 2, 3, 4,6,6);

		repeatedNumber(a);
	}

}
