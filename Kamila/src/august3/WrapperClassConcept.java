package august3;

public class WrapperClassConcept {

	public static void main(String[] args) {
	

		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		int j = 200;
		System.out.println(j);
		String s = String.valueOf(j);
		System.out.println(s+20);
		
		
		String u = "100A";
		int w = Integer.parseInt(u);
		System.out.println(w);
		
		

	}

}
