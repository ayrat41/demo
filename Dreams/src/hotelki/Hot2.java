package hotelki;

public class Hot2 {

	public static void main(String[] args) {
	
	int summ = Hot2.add(20, 50);
	System.out.println(summ);
	
	
	Hot2.plus(summ);
	}
	
	
	public static int add (int a, int b) {
		
		int z=a+b;
		
		return z;
	
				
	}
	
    public static void plus (int z) {
		
		System.out.println(z);
				
	}
}

