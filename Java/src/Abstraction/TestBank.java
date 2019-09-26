package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		SberBank sberBank = new SberBank();
		sberBank.credit();
		sberBank.debit();
		sberBank.loan();
		sberBank.funds();
		
		Bank bank = new SberBank();
		bank.credit();
		bank.debit();
		bank.loan();
	
	}

}
