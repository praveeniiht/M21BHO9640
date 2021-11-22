package collections;

import java.util.*;

class Employee implements Comparable<Employee> {

	private String name;
	private String dept;

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (dept.compareTo(o.dept) < 0)
			return 1;
		else if (dept.compareTo(o.dept) > 0)
			return -1;
		else
			return 0;
	}
}

public class ArrayListEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Praveen", "Testing");
		Employee e2 = new Employee("Kumar", "Salesforce");
		Employee e3 = new Employee("Sunil", "Oracle");
		List<Employee> emps = new ArrayList();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);

		System.out.println(emps);

		for (Employee e : emps) {
			System.out.println(e.getName() + " " + e.getDept());
		}
		System.out.println("using the for each");
		emps.forEach(System.out::println);

		System.out.println("Using iterator ");
		Iterator itr = emps.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
