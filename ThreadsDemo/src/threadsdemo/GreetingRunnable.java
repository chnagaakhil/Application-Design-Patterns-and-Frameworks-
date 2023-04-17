package threadsdemo;

import java.util.Date;

public class GreetingRunnable implements Runnable{
	private String greeting;
	  private static final int REPETITIONS = 10;
	  private static final int DELAY = 1000;

	  public GreetingRunnable(String aGreeting) 
	{
		greeting = aGreeting;
	}
	public void run() {
		for(int i = 1; i <= REPETITIONS; i++) {
			try {
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			} catch (InterruptedException ex){
				System.out.println("Interrupt");
				return;
			}
		}
	}
}
