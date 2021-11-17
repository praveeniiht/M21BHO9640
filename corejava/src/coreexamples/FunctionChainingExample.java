package coreexamples;

import java.util.function.Function;

public class FunctionChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> f1 = x->2*x;
		Function<Integer,Integer> f2 = y->y*y;
		System.out.println(f1.andThen(f2).apply(3));
		System.out.println(f1.compose(f2).apply(3));

	}

}
