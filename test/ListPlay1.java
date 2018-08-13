package test;

import java.util.ArrayList;
import java.util.Collections;

public class ListPlay1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list .add(3);
		list.add(6);
		//Collections.reverse(list);
		Collections.sort(list);
		for(Integer a:list) {
			System.out.println("Value of list :"+a);
		}
	}

}
