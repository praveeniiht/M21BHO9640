package springjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HaiConfig {
	
	@Bean
	public Person getPerson() {
		return new Person();
	}

}
