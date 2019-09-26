package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class LISTArrayExample {

	public static void main(String[] args) {

				ArrayList <String> studentnames = new ArrayList <String>();
				studentnames.ensureCapacity(6);
				studentnames.add("Airat");
				studentnames.add("Rinat");
				studentnames.add("Vikulya");
				studentnames.add("Lilek");
				studentnames.add("Albinchik");
				for (String str : studentnames) {
					System.out.println("q;eonc" + str);
				}
				
				System.out.println("****using iterator");
				Iterator it = studentnames.iterator();
				while (it.hasNext()) {
				System.out.println(it.next());	
				}
				
//				studentnames.remove(4);
//				System.out.println();
//				System.out.println("Overloded");
//				System.out.println();
//				studentnames.add(4, "Lilechka");
//				
//				for (int i = 0; i < studentnames.size(); i++) {
//					System.out.println(studentnames.get(i));
//				}
		}
}