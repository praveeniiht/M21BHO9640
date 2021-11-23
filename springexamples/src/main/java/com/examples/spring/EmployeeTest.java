package com.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) context.getBean("emp");
		e.showData();

		Address adr = (Address) context.getBean("addr");
		System.out.println(adr.getDno()+" "+adr.getStreet()+" "+adr.getCity());
		
	}

}
