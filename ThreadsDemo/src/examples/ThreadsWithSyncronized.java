package examples;

public class ThreadsWithSyncronized {

	public static void main(String[] args) {
		Printer p = new Printer();

        MyThread myRef = new MyThread(p);
        myRef.start();

        YourThread yourRef = new YourThread(p);
        yourRef.start();
    }
}

class Printer {

    void printDocuments(int noOfCopies, String docName) {
        for (int doc = 1; doc <= noOfCopies; doc++) {
            System.out.println("Printing " + docName + " " + doc);
        }
    }
}

class MyThread extends Thread {

    Printer p;

    public MyThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.printDocuments(12, "Naga Akhil.pdf");
        }
    }

}

class YourThread extends Thread {

    Printer p;

    public YourThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.printDocuments(10, "Chaparala.pdf");
        }
    }
}
