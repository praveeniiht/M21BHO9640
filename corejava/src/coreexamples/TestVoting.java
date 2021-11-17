package coreexamples;
import java.util.Scanner;

public class TestVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age...");
		int age = sc.nextInt();
		
		Voting vote = new Voting();
		
		try {
			vote.checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
