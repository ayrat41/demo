package Inharitance;

public class ChildCalss extends ParentCalss{
	public static int add;
	public static void main(String[] args) {
		ChildCalss m1 = new ChildCalss();
		m1.printname();
		m1.printssn();
		String var1 = m1.firstName;
		System.out.println(var1);
		add=m1.addnum(651, 6984);
		System.out.println(add);
	}
	
	public int addnum (int vol1, int vol2) {
		int vol3 = vol1+vol2;
		return vol3;
	}
	
}
