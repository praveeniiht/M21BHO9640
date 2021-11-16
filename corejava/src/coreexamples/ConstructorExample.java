package coreexamples;

class Box2D{
	int length;
	int breadth;
	
	Box2D(){
		this(1,2);
		System.out.println("Inside the default constructor");
		length=1;
		breadth=1;
	}
	Box2D(int length, int breadth){
		System.out.println("Inside the parameterized constructor");
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea() {
		
		System.out.println("The area is : "+(length*breadth));
	}
	static {
		System.out.println("Inside the static block");
	}
	{
		System.out.println("Inside the non static block....");
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box2D box1 = new Box2D();
		box1.calArea();
		System.out.println(box1);
		
	
		

	}

}
