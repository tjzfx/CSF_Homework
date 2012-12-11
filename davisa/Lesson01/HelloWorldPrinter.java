import java.util.Scanner;
import java.util.ArrayList;

public class HelloWorldPrinter {
	public void printHello() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		ArrayList<String> nameList = new ArrayList<String>();
		int count = 0;
		while (count < 1) {
			System.out.print("Your name?");
			name = scanner.next();
			nameList.add(name);
			System.out.print("Hello ");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.print(((i == 0)?"":", ") + nameList.get(i));
			}
			System.out.println("");
		}
	}
	
	public void printFib() {
//		Scanner scanner = new Scanner(System.in);
//		ArrayList<Integer> fibList = new ArrayList<Integer>();
//		fibList.add(0);
//		fibList.add(1);
//		System.out.println("Which entry in the Fibonacci Sequence would you like to view?");
//		int fibIndex = scanner.nextInt();
//		for (int i = 2; i < fibIndex; i++) {
//			fibList.add(fibList.get(i-1) + fibList.get(i-2));
//		}
//		System.out.println(fibList.get(fibIndex-1));
//		for (int i = 0; i < fibList.size(); i++) {
//			System.out.print(fibList.get(i)+ ",");
//		}
		Scanner scanner = new Scanner(System.in);
		int fib0 = 0;
		int fib1 = 1;
		int fibGoal = 1;
		System.out.println("Which entry in the Fibonacci Sequence would you like to view?");
		int fibIndex = scanner.nextInt();
		if (fibIndex < 1) {
			System.out.println("No Good");
		} else if (fibIndex < 2) {
			System.out.println("0");
		} else if (fibIndex < 3) {
			System.out.println("1");
		} else {
			for (int i = 2; i < fibIndex; i++) {
				fibGoal = fib0 + fib1;
				fib0 = fib1;
				fib1 = fibGoal;
			}
		}
		System.out.println(fibGoal);
	}
}
