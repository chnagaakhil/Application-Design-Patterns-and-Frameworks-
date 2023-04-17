package threadsdemo;

public class GreetingThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingRunnable r1 = new GreetingRunnable("Hello, World!");
		GreetingRunnable r2 = new GreetingRunnable("Goodbye, World!");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.start();
		t1.start();
		t2.interrupt();
	}
}
