package streams;
import java.util.*;
import java.util.stream.Collectors;
public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList();
		names.add("ravi");
		names.add("sai");
		names.add("anil");
		names.add("manoj");
		System.out.println("Without sorting..."+names);
		
		
		List<String> temp = names.stream()
								 .filter(str->str.length()>3)
								 .sorted((s1,s2)->-s1.compareTo(s2))
								 .collect(Collectors.toList());
		
		
		System.out.println(temp);
		
		String temp1 = names.stream()
				 .filter(str->str.length()>3)
				 .min((s1,s2)->-s1.compareTo(s2)).get();
		System.out.println(temp1);
		
		

	}

}
