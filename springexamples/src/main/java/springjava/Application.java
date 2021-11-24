package springjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Application.class);

        ChatService chatService = (ChatService) applicationContext.getBean("chats");
        chatService.test1();
        chatService.test2();

       
	}

}
