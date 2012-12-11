import java.util.Scanner;
import java.util.ArrayList;

/* Create an array list with the fibonacci numbers, 
 * allow users to enter a value "n" to generate the  
 * corresponding number of the fibonacci sequence.
 */

public class Fibonacci {
	public void fibonacciGenerator() 
	{
// Create Fibonacci Array and populate it with the first values. 
		
		ArrayList<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
	
// Add the -1 and -2 values of the index together to create the next number in the sequence, then add that to the array
      
		for (int i = 0; i <=10; i++) {
        int next = fib.get(-1) + fib.get(-2);
		fib.add(next);
		}

		
// Select a number to retrieve the value from the array index
		
		System.out.print("Choose a numerical value to retrieve the corresponding fibonacci number.");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(fib.get(N));
}

}
