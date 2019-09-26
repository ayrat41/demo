package com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MAPTreeExample {

	public static void main(String[] args) {
		
		TreeMap TM = new TreeMap();
		TM.put(1, "Jan");
		TM.put(2, "Feb");
		TM.put(3, "Mar");
		TM.put(4, "Apr");
		TM.put(5, "May");
		
		for (int i = 1; i <= TM.size(); i++) {
			System.out.println("Key is " +i+ " Value is " + TM.get(i));
		}
		
		Set Keys = TM.keySet();
		Iterator IT = Keys.iterator();
		while (IT.hasNext()) {
			int key = (int) IT.next();
			System.out.println(key + "     " + TM.get(key));
		}
	}

}
