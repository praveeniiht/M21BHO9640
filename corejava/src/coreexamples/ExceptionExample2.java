package coreexamples;
import java.io.*;
public class ExceptionExample2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String str = "Hai";
		System.out.println(str.charAt(4));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();

	}

}
