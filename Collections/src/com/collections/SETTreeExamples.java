package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SETTreeExamples {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Airat");
		ts.add("Rinat");
		ts.add("Albina");
		ts.add("Lilek");
		ts.add("Vikulya");
		ts.add("Maximus");
		ts.add("Vitalyas");
		
		System.out.println(ts);
		System.out.println(ts.size());
		
		Iterator it= ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());;			
		}
			
	}

}


