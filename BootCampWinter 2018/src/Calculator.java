
public class Calculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int add = calc.addnumber (20, 30);
		System.out.println(add);
		int sub = calc.subtract (200, 30);
		System.out.println(sub);
		int div = calc.division (200, 30);
		System.out.println(div);
		int mult = calc.multiplication (200, 30);
		System.out.println(mult);

	}
	
	public int addnumber(int x, int y) {
		int z = x + y;
		return z;
	}

	public int subtract(int x, int y) {
		int z = x - y;
		return z;
	}
	
	public int division (int x, int y) {
		int z = x / y;
		return z;
	}
	public int multiplication (int x, int y) {
		int z = x * y;
		return z;
	}
}
