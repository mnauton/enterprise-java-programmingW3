package RyanAndMonica;

public class RyanAndMonica implements Runnable{

	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		// TODO Declare a new task object and create two thread (Ryan), (Monica)
		RyanAndMonica withdrawJob = new RyanAndMonica();
		Thread t1 = new Thread(withdrawJob);
		Thread t2 = new Thread(withdrawJob);
		t1.setName("Ryan");
		t2.setName("Monica");
		t1.start();
		t2.start(); 
	}

	@Override
	public void run() {
		// TODO Set a loop (10 iterations for EUR10) where the thread will try to make withdrawals
		// After each withdrawals, check the balance, to see if the account is overdrawn
		for (int i = 0; i < 10; i++) {
			makeWithdrawal(10);
			if (account.getBalance() < 0) {
				System.out.println("Overdrawn!");
			}
		}
	}

	private synchronized void makeWithdrawal(int amount) {
		System.out.println(Thread.currentThread().getName() + " sees balance of " + account.getBalance());
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			
			// But we need to sleep first
			try {
				System.out.println(Thread.currentThread().getName() + " sleeps");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
			// Wake up the next day - go to ATM to withdraw
			System.out.println(Thread.currentThread().getName() + " woke up");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes withdrawal\n");
		} else {
			System.out.println("Insufficient balance for " + Thread.currentThread().getName());
		}
	}
}
