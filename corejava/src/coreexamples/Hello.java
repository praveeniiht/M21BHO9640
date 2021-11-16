package coreexamples;
class Box{
	int lenght;
	int breadth;
	public String toString() {
		return "Iam from box";
	}
}
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		Box box1 = new Box();
		Box box2 = new Box();  
		System.out.println("Hello World");
		System.out.println(10);
		System.out.println(1.234);
		System.out.println(false);
		
		System.out.println(box1);  // it will print the object id
		System.out.println(box2); 
		emp.readData();
		emp.writeData();

	}

}
