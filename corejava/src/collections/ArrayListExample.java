package collections;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> p1 = str-> str.charAt(0)=='J';
		Predicate<String> p2 = str-> str.length()>5;
		
		
		ArrayList ar = new ArrayList();
		ArrayList ar1 = new ArrayList();
		
		ar.add("India");
		ar.add("Japan");
		ar.add("China");
		ar.add("Srilanka");
		ar.add("Japan");
		System.out.println(ar);
		
		ar1.add("America");
		ar1.add("Germany");
		ar1.add("Swedan");
		System.out.println(ar1);
		
		ar.addAll(ar1); //  ar = ar+ar1
		System.out.println("After addAll method.");
		System.out.println(ar);
		
		System.out.println(ar.contains("india"));
	//	System.out.println(ar.remove(0));
	//	System.out.println(ar.remove("Japan"));
	//	System.out.println(ar.removeAll(ar1));
		
		System.out.println(ar.removeIf(p2));
		
		System.out.println("After removal of ar1 collection");
		System.out.println(ar);
		
		

	}

}
