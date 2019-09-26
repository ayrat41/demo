package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DublicateValueArray {

	public static void main(String[] args) {
		String [] names = {"Airat", "Rinat", "Lilya", "Vika", "Albina", "Max", "Rinat"};
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("The dublicate element+++>" + names[i]);
				}
			}
		}
		Set <String> nameset = new HashSet<String>();
		for (String name : names) {
			if (nameset.add(name)==false)
					System.out.println("Dublicate value ===>" + name);			
		}
		
		Map <String, Integer> mapnames = new HashMap <String, Integer>();
		for (String name : names) {
			Integer countInteger = mapnames.get(name);
			if (countInteger==null) {
					mapnames.put(name, 1);
			}else {
				mapnames.put(name, ++countInteger);
			}
			
		}
		Set<Entry<String, Integer>> setmapEntries = mapnames.entrySet();
		for(Entry<String, Integer> entry : setmapEntries) {
			if(entry.getValue()>1) {
				System.out.println("Dublicate value====>>>" + entry.getKey());
			}
		}
	}
	

}
