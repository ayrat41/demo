package com.collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SETLinkedHashExample {

	public static void main(String[] args) {
	LinkedHashSet LHS = new LinkedHashSet();
	LHS.add("Kamila");
	LHS.add("Airat");
	LHS.add("Malik");
	LHS.add("Ailin");
	LHS.add("Davanika");
	
	Iterator it = LHS.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}	
	System.out.println(LHS.size());
	LHS.remove("Davanika");	
	
	Iterator it1 = LHS.iterator();
	while (it1.hasNext()) {
		System.out.println(it1.next());
	    }
	LHS.retainAll(LHS);
	System.out.println(LHS);
	LHS.removeAll(LHS);
	System.out.println(LHS);
	

	
	}

}
