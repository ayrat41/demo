package august4;

public class HSBCBank implements USBank, BrazilBank{
	
	public void credit() {
		System.out.println("hsbc -- credit");
		
	}
	
	public void debit() {
		System.out.println("hsbc -- debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc -- transfer Money");
	}
	
	public void educationLoan() {
		System.out.println("hsbc -- education Loan");
		
	}
	public void carLoan() {
		System.out.println("hsbc -- car Loan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc -- mutual fund");
		
	}
	
	

}
