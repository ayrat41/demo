package com.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MAPLinkedHashExample {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new  LinkedHashMap();
		lhm.put(1, "Jan");
		lhm.put(2, "Feb");
		lhm.put(3, "Mar");
		lhm.put(4, "Apr");
		lhm.put(5, "May");
		
		for (int i = 1; i < lhm.size(); i++) {
			System.out.println("Key is " +i+ " Value is " + lhm.get(i));
		}
		
		Set Keys = lhm.keySet();
		Iterator IT = Keys.iterator();
		while (IT.hasNext()) {
			int key = (int) IT.next();
			System.out.println(key + "     " + lhm.get(key));
		}
		
			
		
	}

}
