package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SETHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Ruby");
		hs.add("Selenium");
		hs.add("UFT");
		hs.add("Java");
		
		System.out.println(hs);
		
		Iterator iterator = hs.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
