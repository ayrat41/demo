package august4;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		// dynamic polymorphism:
		// child class object can be referred by parent Interface reference var
		
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}
	

}
