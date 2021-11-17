package coreexamples;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Function<Integer, Double> area = radius -> 3.141 * radius * radius;

		Function<Integer, Integer> fact = number -> {
			int f = 1;
			for (int i = 2; i <= number; i++)
				f = f * i;
			return f;
		};

		System.out.println("Enter the radius ");
		int r = sc.nextInt();
		System.out.println("The area of circle with radius 5 is : " + area.apply(r));
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		System.out.println("The factorial of 4 is : "+fact.apply(n));

	}

}
