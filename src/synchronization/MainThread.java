package synchronization;

public class MainThread {

	public static void main(String args[]) throws InterruptedException {
		
		final Counter counter = new Counter();
		
		//Thread 1
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				for (int i=0; i<1000; i++) { 
					counter.increment();
				}
			}
			
		}, "Thread-1");
		
		//Thread 2
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				for (int i=0; i<1000; i++) { 
					counter.increment();
				}
			}
			
		}, "Thread-2");
		
		
		//Thread 3
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				for (int i=0; i<1000; i++) { 
					counter.increment();
				}
			}
			
		}, "Thread-3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();		
		t3.join();
		
		
		System.out.println("Counter value is: " + counter.getCounter());
		System.out.println("Main Thread exiting...");
		
	}
	
}
