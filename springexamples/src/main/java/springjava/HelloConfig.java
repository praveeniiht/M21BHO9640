package springjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	
	@Bean
	public HelloWorld getHelloBean() {
		return new HelloWorld();
	}
	
	@Bean
	public University getUniversityBean() {
		return new University();
	}

}
