package HomeWorkCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeCars {

	public static void main(String[] args) {
		Map Cars = new TreeMap();
		
		Cars.put(1, "Mercedes");
		Cars.put(2, "BMW");
		Cars.put(3, "Audi");
		Cars.put(4, "Opel");
		Cars.put(5, "Porsche");
		
		Set keys = Cars.keySet();
		
		Iterator IT = keys.iterator();
		
		while (IT.hasNext()) {
			int k = (int)IT.next();
			System.out.println(k + " " +Cars.get(k));
			
		}
	}

}
