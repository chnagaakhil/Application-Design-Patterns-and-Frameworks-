package Question20;

public class ThreadStages {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());

		// NEW state
		System.out.println("Thread t1 state: " + t1.getState()); // NEW
		System.out.println("Thread t2 state: " + t2.getState()); // NEW

		t1.start();
		t2.start();

		// RUNNABLE state
		System.out.println("Thread t1 state: " + t1.getState()); // RUNNABLE
		System.out.println("Thread t2 state: " + t2.getState()); // RUNNABLE

		// Yield CPU to other threads
		Thread.yield();

		// BLOCKED state
		System.out.println("Thread t1 state: " + t1.getState()); // BLOCKED
		System.out.println("Thread t2 state: " + t2.getState()); // BLOCKED

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// WAITING state
		System.out.println("Thread t1 state: " + t1.getState()); // WAITING
		System.out.println("Thread t2 state: " + t2.getState()); // WAITING

		// Interrupt thread t1
		t1.interrupt();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// TERMINATED state
		System.out.println("Thread t1 state: " + t1.getState()); // TERMINATED
		System.out.println("Thread t2 state: " + t2.getState()); // TERMINATED
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			try {
				// Acquire lock and sleep for 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// Handle interrupted exception
				System.out.println("Thread interrupted");
			}
		}
	}
}
