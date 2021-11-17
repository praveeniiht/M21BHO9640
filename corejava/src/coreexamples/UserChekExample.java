package coreexamples;
import java.util.Scanner;
import java.util.function.*;
class User{
	String uname;
	String passwd;
	User(String uname, String passwd){
		this.uname=uname;
		this.passwd=passwd;
	}
}
public class UserChekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<User> p1 = user-> user.uname.equals("admin") && user.passwd.equals("1234");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter usr name");
		String uname = sc.nextLine();
		System.out.println("Enter password ");
		String pwd = sc.nextLine();
		
		User user = new User(uname,pwd);
		
		if(p1.test(user))
			System.out.println("Valid user");
		else
			System.out.println("invalid user");
		
	}

}
