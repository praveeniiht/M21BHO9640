package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new HashSet();
		Set s3 = new TreeSet();
		
		Employee e1 = new Employee("Praveen","Testing");
		Employee e2 = new Employee("Kumar","Salesforce");
		Employee e3 = new Employee("Sunil", "Oracle");
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		
		System.out.println("Elements in hashset");
		System.out.println(s1);
		
		System.out.println("Elements in tree set");
		s3.add(e1);
		s3.add(e2);
		s3.add(e3);
		System.out.println(s3);

	}

}
