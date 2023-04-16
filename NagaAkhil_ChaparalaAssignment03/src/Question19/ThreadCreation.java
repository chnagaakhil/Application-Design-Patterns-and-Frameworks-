package Question19;

//Method 1: Extending the Thread class
class MyThread extends Thread {
	public void run() {
		System.out.println("MyThread running");
	}
}

//Method 2: Implementing the Runnable interface
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("MyRunnable running");
	}
}

public class ThreadCreation {
	public static void main(String[] args) {
		// Creating a thread using the first method
		MyThread myThread = new MyThread();
		myThread.start();

		// Creating a thread using the second method
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}

