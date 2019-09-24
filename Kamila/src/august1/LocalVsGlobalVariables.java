package august1;

public class LocalVsGlobalVariables {
	
	// global vars -- class variables
	String name = "Tom";
	int age = 25;
	

	public static void main(String[] args) {
		
		int  i = 10; // local var
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	
	public void sum() {
		int i = 10; // local var for sum method
		int j = 20;
	
		
	}
}
