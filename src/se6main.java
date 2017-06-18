import java.util.Arrays;

public class se6main {
	
	/*
	public int compute(int a, int b) {
		static int i = 0;
		i++;
		return a * b + 1 / 2;
	}
	*/
	
	public static void main(String args[]) {
		String[] countries = {"Belgium", "Romania", "Japan", "Canada"};
		Arrays.sort(countries, null);
		for (String country : countries) {
			System.out.print(country + " ");	
		}
		
		
		
	}

}
