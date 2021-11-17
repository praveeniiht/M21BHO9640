package coreexamples;

import java.io.*;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("Inside the file not found block...");
		}
		try {
			int a = 10, b = 2;
			if (a < b)
				throw new ArithmeticException();
			else
				throw new StringIndexOutOfBoundsException();
		} catch (ArithmeticException e) {
				System.out.println("Inside the arthimetic exception");
		} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Inside the string index exception ");
		}

	}

}
