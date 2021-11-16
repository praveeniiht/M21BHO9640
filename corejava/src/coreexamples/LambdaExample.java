package coreexamples;

class MyThread implements Runnable{
	public void run() {
		System.out.println("Inside the Thread run method...");
	}
}

interface Maths{
	public int add(int a, int b);
}

class MathsTest implements Maths{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myt = new MyThread();
		Thread t = new Thread(myt);
		t.start();
		
		Runnable r = ()->System.out.println("Inside the Thread run method using lambda...");
		Thread t1 = new Thread(r);
		t1.start();
		
		MathsTest m1 = new MathsTest();
		System.out.println(m1.add(10,20));
		
		Maths obj = (a,b)->a+b;
		System.out.println("THe sum is : "+obj.add(20,30));
		

	}

}
