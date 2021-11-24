package springjava;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	

}
