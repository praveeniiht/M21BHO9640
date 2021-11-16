package coreexamples;

class BoxTwoD {
	int length;
	int breadth;

	BoxTwoD(int length, int breadth) {
		System.out.println("Inside the box2d");
		length = 3;
		breadth = 4;
	}

	public void calArea() {
		System.out.println("The area is : " + (length * breadth));
	}
}

class BoxThreeD extends BoxTwoD {

	int height;

	BoxThreeD() {
		super(4,2);
		System.out.println("Inside the box3d");
		height = 2;
	}

	public void calVolume() {
		System.out.println("The volume is : " + (length * breadth * height));
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxThreeD box3d = new BoxThreeD();
		box3d.calArea();
		box3d.calVolume();

	}

}
