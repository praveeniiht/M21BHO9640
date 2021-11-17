package coreexamples;

class InvalidAgeException extends RuntimeException{

	public InvalidAgeException(){
		super("Age cannot be either negative or more than 100");
		}
}