package coreexamples;

abstract class EBussiness{
	
	int x;
	
	EBussiness(){
		System.out.println("Inside the constructor..");
	}
	public void goodSelection() {
		System.out.println("Items must be selected from www.ebussiness.com");
	}
	
	public abstract void payment(); 
	public void shipment() {
		System.out.println("Item is shipped through Professional courier only");
	}
}
class Shop1 extends EBussiness{
	public void payment() {
		System.out.println("Payment can be made through cash...");
	}
}


class Shop2 extends EBussiness{
	public void payment() {
		System.out.println("Payment can be made through monthly credit done in books...");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop1 eb1 = new Shop1();
		Shop2 eb2 = new Shop2();
		
		eb1.goodSelection();
		eb1.payment();
		eb1.shipment();
		
		eb2.goodSelection();
		eb2.payment();
		eb2.shipment();

	}

}
