package HomeWorkCollection;

import java.util.HashMap;
import java.util.Map;

public class MapHashCars {

	public static void main(String[] args) {
		Map Cars = new HashMap();
		Cars.put(1, "BMW");
		Cars.put(2, "Opel");
		Cars.put(3, "VW");
		Cars.put(4, "Mersedes");
		Cars.put(5, "AUDI");
				
		System.out.println(Cars.get(3));
		System.out.println(Cars.size());
		
		for (int i = 1; i <= Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}
		
		Cars.remove(3);
		
		for (int i = 1; i <= Cars.size(); i++) {
			System.out.println(Cars.get(i));
		}
		

	}

}
