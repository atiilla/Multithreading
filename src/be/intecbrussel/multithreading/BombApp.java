package be.intecbrussel.multithreading;

public class BombApp {
	private static int tiktak = 9;

	public static void main(String[] args) {
		run();

	}

	public static void run() {
		while ((9 > 0)) {
			try {
				Thread.sleep(1000);
				System.out.format("Timebomb ticking: " + --tiktak + "\n");

			} catch (InterruptedException e) {
			}
			if (tiktak == 0) {
				System.out.println("boooooooooom!!!");
				System.exit(0);
			} else if (tiktak == 4) {
				
				System.out.println("Disarmed!!!");
				try {
					Thread.sleep(4000);
					System.out.println("Haha! No i am just kidding");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(tiktak == 2) {
				disarm();
				System.out.println("Disarmed! :D seriously");
				System.exit(0);
			}
		}

	}

	public static void disarm() {
		Thread.interrupted();

	}

}
