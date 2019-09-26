public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	// classname object name = new classname();
	Method object1 = new Method();
object1.addnumber();
object1.multypl(120, 9824);
int subval = object1.substruct(651, 321);
System.out.println("subval outside method" + subval);
dividenum(35,39);
System.out.println(mulnum (123,23));
	}

	public void addnumber () {
    	int val1 = 10;
    	int val2 = 20;
	int summ = val1+val2;
	System.out.println(summ);
	}
	
	public void multypl (int val1, int val2) {
		int mult = val1 * val2;
		System.out.println(mult);
		}
	
	public int substruct(int val1, int val2) {
		int substruct = val1 - val2;
		System.out.println("subval inside" + substruct);
		return substruct;
	}
		
    public static void dividenum (int val1, int val2) {
    	float divideval = val1/val2;
    	System.out.println(divideval);		
	}

    
    public static int mulnum (int val1, int val2) {
    	return val1*val2;
    }
    
    
}
