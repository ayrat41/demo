
public class Overload_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overload_methods mc1 = new Overload_methods ();
		mc1.addnum();
		mc1.addnum(10,20);
		mc1.addnum(10.5,20);
		mc1.addnum(20,30.5);
		
	}

	public void addnum () {
		int val1 = 10;
		int val2 = 20;
		System.out.println(val1 + val2);
	}
	
	public void addnum ( int val1, int val2) {
	
		System.out.println(val1 + val2);
	}
	
	public void addnum ( double val1, int val2) {
		
		System.out.println(val1 + val2);
	}
	
	public void addnum ( int val1, double val2) {
		
		System.out.println(val1 + val2);
	}
	
}
