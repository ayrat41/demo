package HomeWorkCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCars {

	public static void main(String[] args) {
		List Cars = new LinkedList();
		Cars.add("Toyota");
		Cars.add("Honda");
		Cars.add("Jaguar");
		Cars.add("Ford");
		Cars.add("Honda");
		
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));			
		}
		Cars.remove("Honda");
		
		for (int i = 0; i < Cars.size(); i++) {
			System.out.println(Cars.get(i));			
		}
		
//		Cars.remove(2);
//		Cars.add(3, "Chevrolet");
//		System.out.println("_______________");
//		for (int i = 0; i < Cars.size(); i++) {
//			System.out.println(Cars.get(i));			
//		}
//		
//		Cars.listIterator(3);
		
	}

}
