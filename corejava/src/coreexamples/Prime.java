package coreexamples;

import java.util.Scanner;

class Arthimatics {
	public boolean isPrimeNumber(int number) {
		int counter;
		boolean isPrime = true;
		for (counter = 2; counter <= number - 1; counter++) {

			if (number % counter == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public int reverse(int number) {
		// you have to write the code to reverse the given number
		int reverse=0, reminder;
		while(number>0) {
			reminder = number%10;
			reverse = reverse*10+reminder;
			number/=10;
		}
		
		return reverse;
	}
	
}

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int number = scanner.nextInt();
		Arthimatics arthimetics = new Arthimatics();
		boolean isPrime = arthimetics.isPrimeNumber(number);

		if (isPrime)
			System.out.println("The given number is prime");
		else
			System.out.println("Not a prime...");
		
		System.out.println(arthimetics.reverse(number));

	}

}
