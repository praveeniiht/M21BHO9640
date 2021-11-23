package main;

import model.Persons;
import service.PersonServiceImpl;
import service.PersonsService;
import java.util.*;
public class PersonsMain {
	public static void main(String args[]) {
		PersonsService service = new PersonServiceImpl();
		
		/*List<Persons> persons = service.getAllPersons();
		System.out.println("Persons table data...");
		persons.forEach(System.out::println);
		*/
		Scanner sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pid ");
		int pid = sc1.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter state");
		String state = sc.next();
		Persons p = new Persons(pid,name,city,state);
		String result = service.insertPerson(p);
		System.out.println(result);
		
		
		
	}

}
