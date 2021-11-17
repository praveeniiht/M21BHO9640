package coreexamples;

public class Voting {
	
	public void checkAge(int age) throws InvalidAgeException {
		if(age >=0 && age < 18)
			System.out.println("You are not eligible for voting...");
		else if( age >=18 && age <= 100)
			System.out.println("Your are eligible for voting");
		else
		{
			if(age < 0 || age > 100)
				throw new InvalidAgeException();
		}
			
	}

}
