package coreexamples;

class A{
	final int x=100;
	A(){
		//x=20;
	}
	public void show() {
		//x++;
		System.out.println("x = "+x);
	}
}

class B extends A{
	int y;
	B(){
		y=30;
	}
	public void show() {
		//x++;
		System.out.println("x = "+x+" Y = "+y);
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.show();

	}

}
