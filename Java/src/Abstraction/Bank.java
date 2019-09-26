package Abstraction;

public abstract class Bank {
	int amt = 10;
	final int rate = 12;
	static int summ = 14;
	
	public abstract void loan();
	public void credit() {
		System.out.println("Credit");
	}
	public void debit() {
		System.out.println("Debit");
	}
}
