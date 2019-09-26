package HomeWorkCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCars {

	public static void main(String[] args) {
	    List Cars = new ArrayList();
		
		Cars.add("Toyota");
		Cars.add("Lexus");
		Cars.add("Nissan");
		Cars.add("Hyundai");
		Cars.add("Honda");
		Cars.add("Hyundai");
//		System.out.println(Cars.get(4));
		
//		System.out.println("Here is the list ");
//		System.out.println();
//				
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}	
		Cars.remove("Hyundai");
		
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}	
//		
//		System.out.println("Here is the list w/o number 2");
//		System.out.println(Cars.size());
//				
//		for (int i1 = 0; i1 < Cars.size(); i1++) {
//			System.out.println(Cars.get(i1));
//		}	
//		
//		Cars.remove(2);
//		Cars.add(3, "Lada");
//		Cars.add("Ford");
//		
//		System.out.println("Here is the list w/o number 2");
//		System.out.println(Cars.size());
//		
//		for (int i2 = 0; i2 < Cars.size(); i2++) {
//			System.out.println(Cars.get(i2));
//		}
	}
	
}