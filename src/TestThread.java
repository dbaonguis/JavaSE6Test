
public class TestThread {

	public static void main(String[] args) {
		
		/* Using Runnable
		 * 
		 * 
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
		*/
		
		
		/* Using Thread*/
		
		/*
		ThreadDemo t1 = new ThreadDemo("Thread-1");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Thread-2");
		t2.start();
		*/
		
		//Guess Anumber
		
		GuessANumber guessANumber = new GuessANumber(70);
		guessANumber.start();
		
	}

}
