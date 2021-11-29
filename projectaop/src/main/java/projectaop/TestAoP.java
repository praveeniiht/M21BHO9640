package projectaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Customer customer = (Customer) context.getBean("customer");
			
		//	customer.addCustomer();
		//	customer.addCustomerThrowException();
			
			customer.addCustomerAfter();
			
			
			//context.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}

}
