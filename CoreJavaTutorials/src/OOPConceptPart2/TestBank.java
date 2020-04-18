package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		// Call int variable which has been declared in interface
		System.out.println(USBank.min_bal);
		// HSBCBank.min_bal = 200; // we can not change the value of interface
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		System.out.println("**************");
		
		// Dynamic Polymorphism:
		// child class object can be referred by parent interface variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		BrazilBank bb = new HSBCBank();
		bb.mutualFund();
	}

}
