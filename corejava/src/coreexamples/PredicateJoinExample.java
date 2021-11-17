package coreexamples;

import java.util.function.Predicate;

public class PredicateJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = n->n>10;
		Predicate<Integer> p2 = x -> x%2==0;
		
		Predicate<Integer> prime = n -> {
			boolean isPrime=true;
			for(int i=2;i<=n-1;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			return isPrime;
		};
		
		System.out.println(p1.and(p2).test(16));
		System.out.println(p1.or(p2).test(4));
		System.out.println(p1.test(7));
		System.out.println(p1.negate().test(77));
		
		System.out.println(p2.negate().test(9));
		
		System.out.println("Is Prime:"+prime.and(p2).negate().test(11));

	}

}
