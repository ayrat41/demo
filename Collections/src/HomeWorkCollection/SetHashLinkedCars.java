package HomeWorkCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetHashLinkedCars {

	public static void main(String[] args) {
		
		Set Cars = new LinkedHashSet();
		
		Cars.add("BMW");
		Cars.add("AUDI");
		Cars.add("MERCEDES");
		Cars.add("VW");
		Cars.add("OPEL");
		Cars.add("LADA");
	    
		Iterator IT = Cars.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
		}
		System.out.println(Cars.size());
		
		Cars.remove("VW");
		
		Iterator IT1 = Cars.iterator();
		while (IT1.hasNext()) {
			System.out.println(IT1.next());
		}
		System.out.println(Cars.size());
		
		
	}

}
