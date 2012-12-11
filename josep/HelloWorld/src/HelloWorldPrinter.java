import java.util.Scanner;


public class HelloWorldPrinter {

	public void sayHello()
	{
		System.out.println("Your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello " + name + "!");
	}
	
	public void getFibonacci()
	{
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int iUserNumber = sc.nextInt();
		
		long fib1 = 0;
		long fib2 = 1;
		
		for (int iCounter = 0; iCounter < iUserNumber; iCounter++)
		{
			fib1 += fib2;
			fib2 = fib1 - fib2;
		}
		
		System.out.println("Fibonacci number: " + fib2);
	}
}
