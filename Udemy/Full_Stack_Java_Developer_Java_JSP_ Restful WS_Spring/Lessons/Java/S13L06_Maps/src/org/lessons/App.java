package org.lessons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
//		Use tree map if sequence is important
		Map<Integer, String> student = new HashMap<>();
//		no guarentee for the order
		student.put(3, "Vengethasamy");
		student.put(1, "Kayen");
		student.put(2, "Joshua");
		student.put(7, "Kandier");
		student.put(5, "Suzuki");
		student.put(10, "Ciaz");
//		entry is a dataset from the map. Whenever we are putting the data inside the map, it is a complex set of data
//		This type of data is known as entries. Hence we use the below method
//		for (Map.Entry<Integer, String> entry : student.entrySet()) {
//			System.out.println(entry);
//			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//		}
		System.out.println("**********************************");
//		Print an element
//		key is identifier, value is the value
		System.out.println(student.get(3));
		System.out.println("**********************************");
//		alternative way of iterating through a map
//		way 1
//		for(Integer key : student.keySet()) {
//			System.out.println("Key : " + key + " Value : " + student.get(key));			
//		}
//		way 2
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();

		while (entry.hasNext()) {
//			System.out.println(entry.next());
//			It will not print everything. This is because of the next method. The cursor of the iterator will proceed
//			In  this case, we are moving the cursor twice. Half are getting executed, half are being viewed
//			System.out.println("Key : " + entry.next().getKey() + " Value : " + entry.next().getValue());
//			solution
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key : " + temp.getKey() + " Value : " + temp.getValue());
		}

	}

}
