package ThreadTest;

public class Counter implements Runnable {
	private int totalCtr = 0; // this is the thread task id
	
	@Override
	public void run() {
		int numCtr = this.totalCtr++;

		// TODO create a task that prints number 0 to 3 together with the thread task id
		for (int i = 0; i < 4; i++){
			System.out.printf("Counter %s: %s%n", numCtr, i);
			/*pause(Math.random());*/
			pause(1);
		}
	}
	
	private void pause(double s) {
		// TODO out the thread to sleep given the argument s
		try {
			Thread.sleep(Math.round(10 * s));
		} catch (InterruptedException ex) {
			System.out.println("Pause interrupted with " + ex.getMessage());
		}
	}
}
