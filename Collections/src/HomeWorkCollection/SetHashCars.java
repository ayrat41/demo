package HomeWorkCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashCars {

	public static void main(String[] args) {
		
		Set Cars = new HashSet ();
		Cars.add("Toyota");
		Cars.add("Hyundai");
		Cars.add("Lada");
		Cars.add("BMW");
		Cars.add("Audi");
		Cars.add("KIA");
			
		System.out.println(Cars.size());
		
		Iterator IT = Cars.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
			
		}
		System.out.println(Cars.iterator());
		Cars.remove("KIA");
		System.out.println(Cars.size());
		Iterator IT1 = Cars.iterator();
		while (IT1.hasNext()) {
			System.out.println(IT1.next());
		}
		
		

	}

}
