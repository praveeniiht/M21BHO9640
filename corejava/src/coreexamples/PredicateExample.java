package coreexamples;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = n->n%2==0;
		
		Predicate<String> p2 = str->str.length()>5;
		
		System.out.println(p1.test(6));
		System.out.println(p1.test(11));
		
		System.out.println(p2.test("India"));
		System.out.println(p2.test("Hello India"));


	}

}
