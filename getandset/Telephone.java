package getandset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Telephone {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map1= new HashMap<>();
		
		for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
		    System.out.println(alphabet);
		    String stringValueOf = String.valueOf(alphabet);
		    for(int i=1;i<=26;i++) {
		    	HashMap<String, Integer> map = new HashMap<>();
		    	map.put(stringValueOf, i);
		    	 Set entrySet = map.entrySet();
				    // Obtaining an iterator for the entry set
				    Iterator it = entrySet.iterator();
				    
				    // Iterate through HashMap entries(Key-Value pairs)
				    System.out.println("HashMap Key-Value Pairs : ");
				    while(it.hasNext()){
				    	Map.Entry me = (Map.Entry)it.next();
				    	System.out.println("Key is: "+me.getKey() + 
				    			" & " + 
				    			" value is: "+me.getValue());
		}
		    }
		
		
	}
	}
}
