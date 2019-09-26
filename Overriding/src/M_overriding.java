
public class M_overriding {

	public static void main(String[] args) {
		
		M_overriding test = new M_overriding();
	    test.addnum(90, 80);
	    test.addnum(90, 60, 100);
	    test.addnum(90, 80.65);
	    test.addnum(90, "Hello world");

	}
	
	public void addnum (int var1, int var2) {
		
		int var3= var1 + var2;
		System.out.println(var3);
	}
	
    public void addnum (int var1, int var2, int var3) {
		
		int var4= var1 + var2 + var3;
		System.out.println(var4);
    }
		
	public void addnum (int var1, double var2) {
			
		double var3= var1 + var2;
		System.out.println(var3);
	}
	public void addnum (int var1, String var2) {
		
		System.out.println(var1 + var2);
}


}
