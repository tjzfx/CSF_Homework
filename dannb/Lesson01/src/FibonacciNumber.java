import java.util.ArrayList;
import java.util.Scanner;


public class FibonacciNumber {
	public static void calculateFibNumber() {
		System.out.print("What Fibonacci number would you like? ");
		Scanner scanner = new Scanner(System.in);
		int desiredFibNumber = scanner.nextInt();
		
		ArrayList<Integer> fibNumberList = new ArrayList<Integer>();
		fibNumberList.add(0);
		fibNumberList.add(1);
		
		for (int i = 2; i < desiredFibNumber+2; i++) {
			fibNumberList.add(fibNumberList.get(i - 2) + fibNumberList.get(i-1));
		}
		System.out.println("The Fibonacci number for " + desiredFibNumber + " is " + fibNumberList.get(desiredFibNumber - 1));
	}
	
	public static void calculateFibNumberNoArray() {
		System.out.print("What Fibonacci number would you like? ");
		Scanner scanner = new Scanner(System.in);
		int desiredFibNumber = scanner.nextInt();
		
		int firstNumber = 0;
		int secondNumber = 1;
		int fibNumber = 0;
		
		for (int i = 0; i < desiredFibNumber - 1; i++) {
			fibNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibNumber;
		}
		System.out.println("The Fibonacci number for " + desiredFibNumber + " is " + fibNumber);
	}
}
