package august1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		

	}
	
	public static void main (int p) {
		
	}
	
	public static void main (int q, int r) {
		
	}
	
	public void sum () {
		System.out.println("SUM method - zero param");
		
	}
	
	public void sum (int i) {
		System.out.println("SUM method - 1 input param");
		System.out.println(i);
	}
	
	public void sum (int k, int l) {
		System.out.println("SUM method  - 2 input param");
		System.out.println(k+l);
	}

}
