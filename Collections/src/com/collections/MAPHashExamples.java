package com.collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAPHashExamples {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hs = new HashMap <Integer, String>();
		hs.put(0, "Start");
		hs.put(1, "January");
		hs.put(2, "February");
		hs.put(3, "March");
		hs.put(4, "April");
		hs.put(5, "May");
		hs.put(6, "June");
		
	System.out.println(hs);
//		hs.replace(3, "MARCH");
//		System.out.println("--------------------");
//		for (int i = 0; i < hs.size(); i++) {
//			System.out.println(hs.get(i));
//		}
//		hs.replace(1, "January1", "JANUARY");
//		System.out.println("--------------------");

//		
		System.out.println("--------------------");
		Set Keys = hs.keySet();
		Iterator it = Keys.iterator();
		while (it.hasNext()) {
			Object k = it.next();
			Object v = hs.get(k);
			System.out.println( k + "===>"+v);
		}
//		HashMap <Integer, Employee> emp = new HashMap <Integer, Employee>();
//		Employee e1 = new Employee("Airat", 41, "QA");
//		Employee e2 = new Employee("Malik", 4, "Son");
//		Employee e3 = new Employee("Kamila", 40, "BOSS");
//		Employee e4 = new Employee("Ailin", 2, "Daughter");
//		Employee e5 = new Employee("Rubi", 38, "fifa");
//		Employee e6 = new Employee("Selen", 91, "bibi");
//		Employee e7 = new Employee("Doger", 25, "RAM");
//		
//		emp.put(1, e1);
//		emp.put(2, e2);
//		emp.put(3, e3);
//		emp.put(4, e4);
//		emp.put(4, e5);
//		emp.put(4, e6);
//		emp.put(4, e7);
//		
//		System.out.println(emp.get(4).name);
		
//		for (Map.Entry <Integer, Employee> m : emp.entrySet()) {
//			int key = m.getKey();
//			Employee employee = m.getValue();
//			System.out.println(key + "Info");
//			System.out.println(employee.name);
//			System.out.println(employee.age);
//			System.out.println(employee.dept);
//			
//		}
			
			System.out.println("EntrySET == >"+ hs.entrySet());
				for (Map.Entry m : hs.entrySet()) {
					System.out.println(m);
					
			System.out.println("One more iterator "+ m + "\n" + m.getKey() + " ===>" + m.getValue());
		}
//		
	}

}
