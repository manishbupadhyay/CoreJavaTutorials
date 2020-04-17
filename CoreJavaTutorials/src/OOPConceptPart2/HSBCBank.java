package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// here we are achieving multiple inheritance
	// is-a relationship
	
	//If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface
	public void credit() {
		System.out.println("HSBC---credit");
	}
	
	public void debit() {
		System.out.println("HSBC---debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");
	}
	
	// seperate method of HSBCBank class
	public void educationLoan() {
		System.out.println("HSBC---educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC---carLoan");
	}
	
	// BrazilBank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HSBC-- mutual --- fund");
	}
}
