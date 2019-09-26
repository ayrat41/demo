package com.collections;

import java.util.*;

public class AllInOne {
	
	public static void main (String[] args) {
		AllInOne a = new AllInOne();
		a.ArrayListSample();
	}
	public void ArrayListSample () {	
	ArrayList <Integer> aList = new ArrayList <Integer> ();
		aList.add(32);
		aList.add(25);
		aList.add(54);
		aList.add(46);
		aList.add(67);
		aList.add(356);
		System.out.println(aList.contains(356));
//		aList.forEach(System.out::println);
		aList.forEach(list->System.out.println(list));
//		for (int i : aList) {
//			System.out.println(i);
//		}
//		Iterator<Integer> iterator = aList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());	
//		}		
	}
	public void LinkedListSamlple() {
		LinkedList <String> ll = new LinkedList <String> ();
		ll.add("Airat1");
		ll.add("Birat2");
		ll.add("Pirat3");
		ll.add("Tirat4");
		ll.add("Nirat5");
		ll.contains("Airat1");
		for (String str : ll) {
		System.out.println(str);
		}
		Iterator <String> it = ll.descendingIterator();
		while (it.hasNext())
		System.out.println(it.next());
	}
	
	public void HashSetSample() {
		HashSet <String> hs = new HashSet <String>();
		hs.add("Malik1");
		hs.add("Malik2");
		hs.add("Malik3");
		hs.add("Malik5");
		hs.add("Malik4");
		hs.contains("ssadf");
		System.out.println(hs);
		hs.add("Malik7");
		System.out.println(hs);
		Iterator <String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}
		public void LinkedSetSample() {
			LinkedHashSet <String> hs = new LinkedHashSet <String>();
			hs.add("Malik1");
			hs.add("Malik2");
			hs.add("Malik3");
			hs.add("Malik5");
			hs.add("Malik4");
			hs.contains("ssf");
			System.out.println(hs);
			Iterator <String> it = hs.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
	}
		public void TreeSetSample() {
			TreeSet <String> hs = new TreeSet <String>();
			hs.add("Malik1");
			hs.add("Malik2");
			hs.add("Malik9");
			hs.add("Malik5");
			hs.add("Malik4");
			System.out.println(hs.contains("Malik9"));
	
			System.out.println(hs);
			hs.add("Malik7");
			System.out.println(hs);
			Iterator <String> it = hs.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println(System.currentTimeMillis());
		}
		public void HashMapSample() {
			HashMap <Integer, String> hs = new HashMap <Integer, String>();
			hs.put(1, "Malik1");
			hs.put(2, "Malik2");
			hs.put(3, "Malik9");
			hs.put(4, "Malik5");
			hs.put(5, "Malik4");
			boolean t1 = hs.containsKey(7);
			System.out.println(t1);
			boolean t2 = hs.containsValue("Malik5");
			System.out.println(t2);
			System.out.println(hs);
			hs.put(7, "Malik7");
			System.out.println(hs);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println(hs.keySet());
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println(hs.entrySet());
			System.out.println("################################");
			System.out.println(hs.values());
			hs.forEach((k,v)->System.out.println(k + v));
			
//			for (Map.Entry <Integer, String> m : hs.entrySet()) {
//				System.out.println("+++++++++++++++++++++++++++++");
//				System.out.println(m);
//				System.out.println("*****************************");
//				System.out.println(m.getKey() + "==>" + m.getValue());
//			}
//			Iterator <Integer, String> it = hs.iterator<Integer, String>();
//			while (it.hasNext()) {
//				System.out.println(it.next());
//			}
			
			

		}
	
}
