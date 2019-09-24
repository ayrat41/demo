package overriding;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		b.refuel();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.start();
		
		
		

	}

}
