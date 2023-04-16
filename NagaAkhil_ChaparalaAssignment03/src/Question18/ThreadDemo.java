package Question18;

public class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();

        // Try to start the thread again
        thread.start(); // Throws IllegalThreadStateException
    }
}

