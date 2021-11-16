package coreexamples;

class HDFC implements RBI {
	public void savings() {
	System.out.println(x);
		System.out.println("Savings in hdfc bank");
	}

	public void loans() {
		System.out.println("loans in hdfc bank");
	}

	public void deposits() {
		System.out.println("deposits in hdfc bank");
	}
	
	public void servies() {
		System.out.println("rbi services are overriden by hdfc");
	}
}

class SBI implements RBI {
	public void savings() {
		System.out.println("Savings in sbi bank");
	}

	public void loans() {
		System.out.println("loans in sbi bank");
	}

	public void deposits() {
		System.out.println("deposits in sbi bank");
	}
}

public class RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
		SBI sbi = new SBI();
		
		
		hdfc.savings();
		hdfc.loans();
		hdfc.deposits();
		hdfc.servies();
		
		
		
		sbi.savings();
		sbi.loans();
		sbi.deposits();
		
		

	}

}
