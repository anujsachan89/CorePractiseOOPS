package getandset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
private LinkedList<Person> myperson;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(12,11,"Anyh");
		for(Person p:list) {
			System.out.println(p.getAge());
		}
	      
	}

}
