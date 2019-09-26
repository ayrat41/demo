
public class Constructor {

	public static void main(String[] args) {
		Constructor mc1 = new Constructor ();
		Constructor mcp1 = new Constructor (20,30);
	}
Constructor (){
	System.out.println("print inside constructor");
	System.out.println(45-38);
}
Constructor (int val1, int val2) {
	System.out.println(val1 * val2);
}


}
