package coreexamples;

public class ExceptionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// error prones code

		try {
			int a[] = { 1, 2, 3 };
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
				
		}

		try {
			String str = "hai";
			System.out.println(str.charAt(2));
		} catch (StringIndexOutOfBoundsException e) {
			// exception handling code
			System.out.println("Inside the string index catch block");
		}

		try {
			int c = 10 / 2;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// exception handling code
			System.out.println("Inside the arthimetic catch block");
		} finally {
			// will contain the code to be executed mandatorily

			System.out.println("inside the finally block");
		}
		System.out.println("End of the try block");

	}

}
