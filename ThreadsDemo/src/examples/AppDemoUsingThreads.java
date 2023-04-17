package examples;

public class AppDemoUsingThreads {

	public static void main(String[] args) {
		AnotherTask task = new AnotherTask();
        task.start();//internally execute run method.
        
        
        Runnable r = new SomeTask();
        Thread t = new Thread(r);
        t.start();
        
        System.out.println("Start printer 2");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer2");
        }
        System.out.println("End printer 2");
        System.out.println("======================");

    }

}

class AnotherTask extends Thread {

    @Override
    public void run() {
        System.out.println("Start printer 1");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer1");
        }
        System.out.println("End printer 1");
        System.out.println("======================+");
    }
}

class SomeTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Start printer 3");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer3");
        }
        System.out.println("End printer 3");
        System.out.println("======================");
        }
}
