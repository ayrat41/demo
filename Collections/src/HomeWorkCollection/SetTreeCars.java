package HomeWorkCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeCars {

	public static void main(String[] args) {
	
		TreeSet Cars = new TreeSet();
			Cars.add("BMW");
			Cars.add("Mersedes");
			Cars.add("AUDI");
			Cars.add("Audi");
			Cars.add("VW");
		System.out.println(Cars.size());
	    Iterator IT = Cars.iterator();
	    while (IT.hasNext()) {
			System.out.println(IT.next());
		}
	    
	    Cars.remove("Audi");
	    System.out.println(Cars.size());
	    
	}

}
