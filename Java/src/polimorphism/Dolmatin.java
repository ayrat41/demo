package polimorphism;

public class Dolmatin extends Dogs{

	public static void main(String[] args) {
	Animals animals = new Animals();
	animals.eat();
	System.out.println("***********************");
	Animals animals1 = new Dogs();
	animals1.eat();
	System.out.println("***********************");
	Animals animals2 = new Dolmatin();
	animals2.eat();	
	}
	public void Barks() {
		System.out.println("Barks === Dalmatin class");
		
	}
	public void eat(){
		System.out.println("Eat === Dalmatin Class");
		
	}
	public void Sleep() {
		System.out.println("Sleep === Dalmatin class");
		
	}

}
