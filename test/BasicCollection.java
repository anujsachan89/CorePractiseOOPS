package test;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class BasicCollection {

	public static void main(String[] args) {
		TreeSet<Integer> value = new TreeSet<>();
		value.add(7);
		value.add(1);
		value.add(5);
		value.add(8);
		for(int i: value) {
			System.out.println("Value in tree: "+value+":"+i);
		}
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(01, "Anuj Sachan");
		map.put(03, "XYZ");
		map.put(06, "ABC");
		map.put(02, "CDE");
		map.put(04, "sir");
		map.put(05, "Yahoo");
		System.out.println(map);
		Set<Integer> keys = map.keySet();
		System.out.println("Values in Set"+keys);
        for(Integer key: keys){
            System.out.println("Value of "+key+" is: "+map.get(key));
        }
        		for (Entry<Integer, String> entry : map.entrySet())
        		{
        		    System.out.println(entry.getKey() + "/" + entry.getValue());
        		}
       /*System.out.println("All the values"+map.values());
       System.out.println("All the keys"+map.keySet());*/
	}

}
