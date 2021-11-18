package coreexamples;

class FisThread extends Thread {

	public void run() {

		for (int i = 1; i <= 100; i++) 
			System.out.println(i);
		System.out.println(this.getState());
		System.out.println("End of child Thread");
	}
}

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FisThread f = new FisThread();
		f.start();
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println(f.getState());
		System.out.println("End of Main program..");
	}
}
