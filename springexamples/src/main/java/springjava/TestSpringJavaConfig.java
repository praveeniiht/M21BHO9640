package springjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class TestSpringJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(HelloConfig.class,Person.class);
		
		HelloWorld hw = (HelloWorld) ctx.getBean(HelloWorld.class);
		hw.setGreeting("Hello Fis Welcome");
		System.out.println(hw.getGreeting());
		
		University u = (University) ctx.getBean(University.class);
		u.showData();
		
		Person p = (Person) ctx.getBean(Person.class);
		System.out.println(p);

	}

}
