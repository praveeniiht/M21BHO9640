package springjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloWorld hw = (HelloWorld) ctx.getBean(HelloWorld.class);
		hw.setGreeting("Hello Fis Welcome");
		System.out.println(hw.getGreeting());
		
		University u = (University) ctx.getBean(University.class);
		u.showData();

	}

}
