package be.intecbrussel.multithreading;

public class Exercise1 {
	public static void main(String[] args) {
		int C0res = Thread.activeCount();
		System.out.println("# CPU INFORMATION #\nYou have " + C0res + " core." + "\nIt is " + Thread.currentThread().getState()
				+ "\nisAlive?: " + Thread.currentThread().isAlive()+"\n");
		int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {

			run();

			try {
				// 1000 miliseconds = 1 second

				if (C0res >= 1) {
					Thread.sleep(500);
				} else if (C0res >= 2) {
					Thread.sleep(400);

				} else if (C0res >= 3) {
					Thread.sleep(300);

				} else if (C0res >= 4) {
					Thread.sleep(200);

				} else {
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

			// Thread.dumpStack();

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
