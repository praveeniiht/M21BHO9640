package collections;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1 = new HashSet();
		Set s2 = new LinkedHashSet();
		Set s3 = new TreeSet();
		
		s1.add("India");
		s1.add("America");
		s1.add("Swedan");
		s1.add("China");
		s1.add("Swedan");
		System.out.println("The HashSet Elements are : "+s1);
		
		s2.add("India");
		s2.add("America");
		s2.add("Swedan");
		s2.add("China");
		s2.add("America");
		System.out.println("The LinkedHashSet Elements are : "+s2);
		
		s3.add("India");
		s3.add("America");
		s3.add("Swedan");
		s3.add("China");
		s3.add("India");
		System.out.println("The TreeSet Elements are : "+s3);
	}

}
