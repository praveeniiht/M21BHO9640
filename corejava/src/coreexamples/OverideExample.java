package coreexamples;

class Base extends Object {
	int first, second;
	Base(){
		first=10;
		second=20;
	}
	public void calResult() {
		System.out.println("The result is : "+(first*second));
	}
	
	public void test() {
		System.out.println("Inside the base class");
	}
}

class Derived extends Base{
	int third, fourth;
	int first, second;
	Derived(){
		first=1;
		second=2;
		third=4;
		fourth=5;
	}
	public void calDerivedResult() {
		System.out.println("The derived result is  "+(third*fourth*first*second));
	}
	public void test() {
		//super.test();
		System.out.println("Inside the derived class");
	}
	
	public String toString() {
		return first +" "+second+" "+third+" "+fourth;
	}
}



public class OverideExample extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d = new Derived();
		d.calDerivedResult();
		d.test();
		System.out.println(d);

	}

}
