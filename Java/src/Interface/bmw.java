package Interface;

public class bmw implements cars{

	@Override
	public void start() {
		System.out.println("Start BMW");
	}

	@Override
	public void stop() {
		System.out.println("Stop BMW");
		
	}

	@Override
	public void fuel() {
		System.out.println("Fuel BMW");
	}
	
	public void safety () {
		System.out.println("Safety");
	}

}
