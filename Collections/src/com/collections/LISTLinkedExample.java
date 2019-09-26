package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LISTLinkedExample {

	public static void main(String[] args) {
		
		LinkedList LL = new LinkedList();
		LL.add("Airat");
		LL.add("Rinat");
		LL.add("Vikulya");
		LL.add("Lilek");
		LL.add("Albinchik");
		
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));
		}
		
		LL.remove(4);
		System.out.println();
		System.out.println("Overloded");
		System.out.println();
		LL.add(4, "Lilechka");
		
		
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));		
		}
		LL.add(3, "Maximus");
		LL.add("Telyaner");
		
		System.out.println();
		System.out.println("Overloded");
		System.out.println();
		
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));		
		}
		
		LL.removeLast();
		
		System.out.println();
		System.out.println("Overloded");
		System.out.println();
		
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));		
		}
	}

}
