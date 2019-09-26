package HomeWorkCollection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapLinkedHashCars {

	public static void main(String[] args) {
		Map Cars = new LinkedHashMap();
		
		Cars.put(1, "Audi");
		Cars.put(2, "BMW");
		Cars.put(3, "Mercedes");
		Cars.put(4, "VW");
		Cars.put(5, "Opel");
		Cars.put(6, "Porshe");
		Cars.put(7, "Lada");
		
		
		System.out.println(Cars.keySet());
		
		Set keys = Cars.keySet();
		
		Iterator IT = keys.iterator();
		
		while (IT.hasNext()) {
		    int key = (int) IT.next();
			System.out.println (key+ "  " +Cars.get(key));
			
		}								
	}
}
