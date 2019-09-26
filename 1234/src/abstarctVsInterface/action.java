package abstarctVsInterface;

public class action implements InterfaceSample1, InterfaceSample2 {


	@Override
	public void name(String name) {
			
	}

	@Override
	public void age(int age) {
		
	}

	
	@Override
	public void lastName(String lastName) {
		InterfaceSample2.super.lastName(lastName);
	}
	
	static void main(String[] args) {
		action action  = new action();
		action.lastName("Airat");
	}

}
