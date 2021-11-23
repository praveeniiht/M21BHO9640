package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.spring.Employee;
import com.examples.spring.Quiz;

public class TestClass {
	public static void main(String args[])
	{
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		Quiz quiz = (Quiz) context.getBean("qna");
		System.out.println(quiz.getQuestion());
		System.out.println(quiz.getAnswers());
		
	}
}
