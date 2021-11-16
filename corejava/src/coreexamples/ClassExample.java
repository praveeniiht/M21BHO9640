package coreexamples;

class Geometry{
	int length;
	int width;
	static int height=1;
	public void showData() {
		System.out.println(length+"  "+width+" "+height);
	}
	
	public void setData(int a, int b) {
		length=a;
		width=b;

	}
	
	public static void example() {
		System.out.println(height);
		System.out.println("Inside the static method..");
	}
	
	static{
		System.out.println("Inside the static block ");
	}
	
	{
		System.out.println("Inside the non static block");
	}
			
}

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry g = new Geometry();
		Geometry g1 = new Geometry();
		
		Geometry.example();
		
		
		g.setData(10,20);
		g.showData();
		g.height=20;
		g.length=340;
		
		g1.setData(100,200);
		g1.showData();
		g1.height=300;
		
		g.showData();
		

	}

}
