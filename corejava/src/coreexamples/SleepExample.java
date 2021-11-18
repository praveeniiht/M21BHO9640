package coreexamples;

class SleepingThread extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of chidl thread...");
	}
}

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepingThread t = new SleepingThread();
		t.start();
		for(int i=101;i<=200;i++)
			System.out.println(i);
		
		System.out.println("End of main thread...");

	}

}
