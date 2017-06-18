
public class RunnableDemo implements Runnable {
	
	private Thread thread;
	private String threadName;
	

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + this.threadName);
	}

	@Override
	public void run() {
		System.out.println("Running thread: " + this.threadName);
		try {
			for (int i=4; i>0; i--) {
				System.out.println("Thread: " + this.threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException ex) {
			System.out.println("Thread: " + this.threadName + " interrupted!");
		}
		System.out.println("Thread : " + this.threadName + " exiting.");
	}
	
	public void start() {
		System.out.println("Starting thread: " + this.threadName);
		if (thread == null) {
			thread = new Thread(this, this.threadName);
			thread.start();
		}
	}

}
