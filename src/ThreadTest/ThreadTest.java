package ThreadTest;

import javax.swing.table.TableRowSorter;

public class ThreadTest {

	public static void main(String[] args) {

		/*MyRunnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		System.out.println("back in main");*/
		Counter ctr = new Counter();
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(ctr);
			t.start();
	/*		Thread.yield();
            try {
                t.join();
            } catch (InterruptedException e)
			{
                e.printStackTrace(); }
            }*/
			if (i == 1) {
				t.interrupt();
			}
		}
	}
}
