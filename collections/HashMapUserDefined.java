package collections;
import java.util.*;

public class HashMapUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Student> students = new HashMap();
		students.put("1001", new Student("kishore","finance"));
		students.put("1091", new Student("Anil","Marketing"));
		students.put("1032", new Student("Manoj","Operations"));
		
		for(Map.Entry m : students.entrySet()) {
			Student s = (Student)m.getValue();
			System.out.println(m.getKey()+" ---> "+s.getName()+" "+s.getCity());
		}
	}
}
