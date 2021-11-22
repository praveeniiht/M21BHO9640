package collections;
import java.util.*;
import java.util.Comparator;

class Student {
	String name;
	String city;

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}


class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.name.compareTo(s2.name) < 0)
			return -1;
		else if (s1.name.compareTo(s2.name) > 0)
			return 1;
		else
			return 0;
	}

}

class CityNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if (s1.city.compareTo(s2.city) < 0)
			return -1;
		else if (s1.city.compareTo(s2.city) > 0)
			return 1;
		else
			return 0;
	}
}

// (s1,s2)-> s1.name.compareTo(s2.name);

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> ar = new ArrayList();
		ar.add(new Student("kumar","hyderabad"));
		ar.add(new Student("sunil","chennai"));
		ar.add(new Student("arun","mumbai"));
		
		//Collections.sort(ar, (s1,s2)->s1.name.compareTo(s2.name));
		StudentNameComparator sc = new StudentNameComparator();
		CityNameComparator cc = new CityNameComparator();
		
		Collections.sort(ar,sc );
		System.out.println("Object after sorting on names...");
		System.out.println(ar);
		
		//Collections.sort(ar,(s1,s2)->s1.city.compareTo(s1.city));
		
		Collections.sort(ar,cc);
		System.out.println("Object after sorting on city...");
		System.out.println(ar);

	}
}
