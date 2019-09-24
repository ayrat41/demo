package august4;

import java.util.ArrayList;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al.size());
		
		al.add(5);
		al.add(6);
		al.add("Westbrier");
		al.add(12.33);
		al.add('H');
		al.add(true);
		
		System.out.println(al.size());
		System.out.println(al.get(5));
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		
		
			
		}
		
		ArrayList<Integer> al1 = new ArrayList();
		

	}

}
