import java.util.Random;

public class GuessANumber extends Thread {
	
	private int number;

	public GuessANumber(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		int counter = 0;
		int guess = 0;
		
		do {
			guess = new Random().nextInt(100);
			System.out.println(this.getName() + " guesses " + guess);
			counter++;
		} while (number != guess);
		
		System.out.println("** Correct!" + this.getName() + " guessed it in " + counter + " guesses!");
	}
	
}
