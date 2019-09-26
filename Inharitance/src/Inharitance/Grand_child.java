package Inharitance;

public class Grand_child extends ChildCalss {
    String lastName = "Aibedullov";
    
	public static void main(String[] args) {
		
		Grand_child gc = new Grand_child();
		gc.printname();
		gc.printssn();
		System.out.println(gc.addnum(681, 65010));
		System.out.println(add);
		gc.ParentCalss();
		
		
	}
	
	public void ParentCalss() {
		super.printname();
		System.out.println("The last name is "+ lastName);
		
	}

}
