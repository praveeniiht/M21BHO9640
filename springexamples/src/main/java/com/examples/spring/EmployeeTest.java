package com.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) context.getBean("emp");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e);
		System.out.println(e1);
		e.showData();

		Address adr = (Address) context.getBean("addr");
		System.out.println(adr.dno+" "+adr.street+" "+adr.city);
		
		Student s = (Student) context.getBean("student");
		System.out.println(s.name+" "+s.branch+" "+s.address);
		
	}

}
